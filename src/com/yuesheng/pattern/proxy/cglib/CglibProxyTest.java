package com.yuesheng.pattern.proxy.cglib;

/**
 * 描述
 *
 * @author yuesheng
 * @date 2018/4/17 13:07
 */
public class CglibProxyTest {

    public static void main(String[] args) {
        ZhangSan instance = (ZhangSan) new CglibMatchmaker().getInstance(ZhangSan.class);
        System.out.println(instance.getClass());
        instance.findLove();
        instance.findNewLove();
    }
}
