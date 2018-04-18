package com.yuesheng.pattern.singleton.hungry;

/**
 * <p>懒汉式实体</p>
 *
 * <p>防止反射创建多个实例</p>
 *
 * @author yuesheng
 * @date 2018/4/12 23:59
 */
public class HungrySingletonResistReflex {

    private static final HungrySingletonResistReflex instance = new HungrySingletonResistReflex();

    private static boolean flag = true;

    private HungrySingletonResistReflex() {
        synchronized (HungrySingletonResistReflex.class) {
            if (flag) {
                throw new RuntimeException("单例的类不能创建了多个实例！");
            }
        }
    }

    public static HungrySingletonResistReflex getInstance() {
        return instance;
    }
}
