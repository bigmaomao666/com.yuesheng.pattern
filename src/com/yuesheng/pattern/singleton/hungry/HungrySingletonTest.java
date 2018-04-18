package com.yuesheng.pattern.singleton.hungry;

import java.lang.reflect.Constructor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 懒汉式单例
 *
 * @author yuesheng
 * @date 2018/4/12 23:58
 */
public class HungrySingletonTest {

    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(100, 100, 60, TimeUnit.SECONDS, new LinkedBlockingDeque<>());
        for (int i = 0; i < 0; i++) {
            threadPoolExecutor.execute(() -> System.out.println(normalCallInstance()));
        }
        for (int i = 0; i < 0; i++) {
            threadPoolExecutor.execute(() -> System.out.println(reflexCallInstance()));
        }
        for (int i = 0; i < 1; i++) {
            threadPoolExecutor.execute(() -> System.out.println(reflexCallResistReflexInstance()));
        }
        System.out.println(HungrySingletonResistReflex.getInstance());
        threadPoolExecutor.shutdown();
    }

    /**
     * 正常调用
     *
     * @return
     */
    public static HungrySingleton normalCallInstance() {
        return HungrySingleton.getInstance();
    }

    /**
     * 通过反射调用
     *
     * @return
     */
    public static HungrySingleton reflexCallInstance() {
        Class<HungrySingleton> hungrySingletonClass = HungrySingleton.class;
        try {
            Constructor<HungrySingleton> declaredConstructor = hungrySingletonClass.getDeclaredConstructor(null);
            declaredConstructor.setAccessible(true);
            HungrySingleton hungrySingleton = declaredConstructor.newInstance();
            return hungrySingleton;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


    /**
     * 通过反射调用防止反射的实体
     *
     * @return
     */
    public static HungrySingletonResistReflex reflexCallResistReflexInstance() {
        Class<HungrySingletonResistReflex> hungrySingletonClass = HungrySingletonResistReflex.class;
        try {
            Constructor<HungrySingletonResistReflex> declaredConstructor = hungrySingletonClass.getDeclaredConstructor(null);
            declaredConstructor.setAccessible(true);
            HungrySingletonResistReflex lazySingleton = declaredConstructor.newInstance();
            return lazySingleton;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
