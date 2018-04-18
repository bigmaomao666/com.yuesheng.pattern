package com.yuesheng.pattern.singleton.lazy;

import java.lang.reflect.Constructor;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 描述
 *
 * @author yuesheng
 * @date 2018/4/15 09:24
 */
public class LazySingletonTest {

    public static void main(String[] args) {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(100, 100, 60, TimeUnit.SECONDS, new LinkedBlockingDeque<>());


        int count = 100;
        CountDownLatch countDownLatch = new CountDownLatch(count);
        for (int i = 0; i < count; i++) {
            executor.execute(() -> {
                try {
                    countDownLatch.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
//                System.out.println(getLazySingleton());
//                System.out.println(getLazySingletonThreadSafe());
//                System.out.println(getLazySingletonThreadSafeByReflex());
                System.out.println(getLazySingletonInnerClass());
            });
            countDownLatch.countDown();
        }



    }

    public static LazySingleton getLazySingleton() {
        // 线程不安全
        return LazySingleton.getInstance();
    }

    public static LazySingletonThreadSafe getLazySingletonThreadSafe() {
        return LazySingletonThreadSafe.getInstance();
    }

    public static LazySingletonThreadSafe getLazySingletonThreadSafeByReflex() {
        Class<LazySingletonThreadSafe> lazySingletonThreadSafeClass = LazySingletonThreadSafe.class;
        Constructor<LazySingletonThreadSafe> declaredConstructor;
        try {
            declaredConstructor = lazySingletonThreadSafeClass.getDeclaredConstructor(null);
            declaredConstructor.setAccessible(true);
            return declaredConstructor.newInstance();
        } catch (Exception e) {
        }
        return null;
    }

    public static LazySingletonInnerClass getLazySingletonInnerClass() {
        return LazySingletonInnerClass.getInstance();
    }
}
