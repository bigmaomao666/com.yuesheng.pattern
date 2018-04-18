package com.yuesheng.pattern.singleton.lazy;

/**
 * <p>使用私有内部类来创建单例模式</p>
 *
 * <p>java规定内部类加载必须发生在方法调用之前，并且保证类加载是线程安全的</p>
 *
 * @author yuesheng
 * @date 2018/4/15 09:44
 */
public class LazySingletonInnerClass {

    private LazySingletonInnerClass() {}

    public static final LazySingletonInnerClass getInstance() {
        return LazyHolder.instance;
    }

    private static class LazyHolder {
        private static LazySingletonInnerClass instance = new LazySingletonInnerClass();
    }
}
