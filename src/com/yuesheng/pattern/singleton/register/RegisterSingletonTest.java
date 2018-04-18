package com.yuesheng.pattern.singleton.register;

/**
 * 描述
 *
 * @author yuesheng
 * @date 2018/4/15 10:02
 */
public class RegisterSingletonTest {

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                System.out.println(getRegisterSingleton());
            }).start();
        }
    }

    public static RegisterSingleton getRegisterSingleton() {
        return RegisterSingleton.getInstance();
    }
}
