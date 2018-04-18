package com.yuesheng.pattern.singleton.lazy;

/**
 * <p>懒汉式单例</p>
 *
 * <p>在第一次使用的时候创建实例</p>
 *
 * <p>线程不安全的</p>
 *
 * @author yuesheng
 * @date 2018/4/15 09:21
 */
public class LazySingleton {

    private static LazySingleton instance;

    private LazySingleton() {}

    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
