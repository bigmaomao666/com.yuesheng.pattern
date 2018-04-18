package com.yuesheng.pattern.factory.func;

/**
 * 描述
 *
 * @author yuesheng
 * @date 2018/4/16 13:03
 */
public class MilkFactoryTest {

    public static void main(String[] args) {
        MilkFactory factory = new YiLIMilkFactory();
        System.out.println(factory.getMilk());

        factory = new MenNiuMilkFactory();
        System.out.println(factory.getMilk());
    }
}
