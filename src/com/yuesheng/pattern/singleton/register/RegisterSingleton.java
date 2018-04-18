package com.yuesheng.pattern.singleton.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * <p>注册式单例</p>
 *
 * <p>内部维护一个线程安全的map，通过类全名获取类实例</p>
 *
 * <p>在Spring中经常被用到，BeanFactory就使用了此方式的单例模式</p>
 *
 * @author yuesheng
 * @date 2018/4/15 09:56
 */
public class RegisterSingleton {

    private static final Map<String, Object> register = new ConcurrentHashMap<>();

//    static {
//        register.put(RegisterSingleton.class.getName(), new RegisterSingleton());
//    }

    private RegisterSingleton() {}

    public static RegisterSingleton getInstance() {
        return getInstance(null);
    }

    public static RegisterSingleton getInstance(String name) {
        if (name == null) {
            name = RegisterSingleton.class.getName();
        }
        if (!register.containsKey(name)) {
            synchronized (register) {
                if (!register.containsKey(name)) {
                    register.put(name, new RegisterSingleton());
//                    try {
//                        register.put(name, Class.forName(name).newInstance());
//                    } catch (Exception e) {
//                        e.printStackTrace();
//                    }
                }
            }
        }
        return (RegisterSingleton) register.get(name);
    }
}
