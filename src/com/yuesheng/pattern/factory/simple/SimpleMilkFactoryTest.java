package com.yuesheng.pattern.factory.simple;

import com.yuesheng.pattern.prototype.simple.SimplePrototype;

/**
 * 描述
 *
 * @author yuesheng
 * @date 2018/4/16 12:58
 */
public class SimpleMilkFactoryTest {

    public static void main(String[] args) {
        SimpleMilkFactory factory = new SimpleMilkFactory();
        System.out.println(factory.getMilk("YiLi"));
        System.out.println(factory.getMilk("MenNiu"));
        System.out.println(factory.getMilk("MenNiu1"));
    }
}
