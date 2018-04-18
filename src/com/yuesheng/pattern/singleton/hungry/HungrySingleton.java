package com.yuesheng.pattern.singleton.hungry;

/**
 * <p>饿汉式实体</p>
 *
 * <p>类加载的时候就把实例创建好，线程安全的（JVM保证类加载是线程安全的）</p>
 *
 * <p>注意：使用反射可以创建多个实例</p>
 *
 * <li>1、私有化构造方法</li>
 * <li>2、定义一个私有化静态(static)、不可修改(final)的实例</li>
 * <li>3、提供一个公共的获取实例的方法</li>
 *
 * @author yuesheng
 * @date 2018/4/12 23:59
 */
public class HungrySingleton {

    private static final HungrySingleton instance = new HungrySingleton();

    private HungrySingleton() {
    }

    public static HungrySingleton getInstance() {
        return instance;
    }
}
