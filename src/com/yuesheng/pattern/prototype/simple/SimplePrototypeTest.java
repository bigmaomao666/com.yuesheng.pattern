package com.yuesheng.pattern.prototype.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * 描述
 *
 * @author yuesheng
 * @date 2018/4/15 11:50
 */
public class SimplePrototypeTest {

    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        list.add(new Object());
        SimplePrototype prototype = new SimplePrototype("simplePrototype", new Object(), list);
        SimplePrototype clonePrototype = null;
        try {
            clonePrototype = (SimplePrototype) prototype.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        System.out.println(prototype.getClass());
        System.out.println(clonePrototype.getClass());
        System.out.println();

        System.out.println(prototype);
        System.out.println(clonePrototype);
        System.out.println();

        System.out.println(prototype.getName());
        System.out.println(clonePrototype.getName());
        System.out.println();

        System.out.println(prototype.getBody());
        System.out.println(clonePrototype.getBody());
        System.out.println();

        System.out.println(prototype.getObjects());
        System.out.println(clonePrototype.getObjects());
        System.out.println();

        System.out.println(prototype.getObjects().get(0));
        System.out.println(clonePrototype.getObjects().get(0));
        System.out.println();
    }
}
