package com.yuesheng.pattern.factory.abstr;

/**
 * 描述
 *
 * @author yuesheng
 * @date 2018/4/16 13:08
 */
public class AbstractMilkFactoryTest {

    public static void main(String[] args) {
        AbstractMilkFactory factory = new MilkFactory();
        System.out.println(factory.getMenNiu());
        System.out.println(factory.getYiLi());
    }
}
