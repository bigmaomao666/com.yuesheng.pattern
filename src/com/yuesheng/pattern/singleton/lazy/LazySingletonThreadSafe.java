package com.yuesheng.pattern.singleton.lazy;

/**
 * <p>使用同步锁synchronized来保证线程安全</p>
 * <p>无法防止反射创建多个实例</p>
 *
 * @author yuesheng
 * @date 2018/4/15 09:30
 */
public class LazySingletonThreadSafe {

    private static LazySingletonThreadSafe instance;

    private static volatile boolean flag = false;

    private LazySingletonThreadSafe() {
        // 防止反射创建
        if (flag) {
            throw new RuntimeException("单例模式不能创建多个实例");
        }
        flag = true;
    }

    /**
     * 使用synchronized会存在性能问题，需要等待
     */
    public static synchronized LazySingletonThreadSafe getInstance() {
        if (instance == null) {
            instance = new LazySingletonThreadSafe();
        }
        return instance;
    }
}
