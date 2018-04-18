package com.yuesheng.pattern.prototype.deep;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 描述
 *
 * @author yuesheng
 * @date 2018/4/15 17:41
 */
public class DeepPrototypeTest {

    public static void main(String[] args) {
        List<DeepPrototype> list = new ArrayList<>();
        list.add(new DeepPrototype());
        DeepPrototype prototype = new DeepPrototype("DeepPrototype", new DeepPrototype(), list);

        DeepPrototype deepClonePrototype = (DeepPrototype) prototype.deepClone();

        System.out.println(prototype.getClass());
        System.out.println(deepClonePrototype.getClass());
        System.out.println();

        System.out.println(prototype);
        System.out.println(deepClonePrototype);
        System.out.println();

        System.out.println(prototype.getName());
        System.out.println(deepClonePrototype.getName());
        System.out.println();

        System.out.println(prototype.getBody());
        System.out.println(deepClonePrototype.getBody());
        System.out.println();

        System.out.println(prototype.getObjects());
        System.out.println(deepClonePrototype.getObjects());
        System.out.println();

        System.out.println(prototype.getObjects().get(0));
        System.out.println(deepClonePrototype.getObjects().get(0));
        System.out.println();
    }
}
