package com.yuesheng.pattern.factory.simple;

import com.yuesheng.pattern.factory.entity.MenNiu;
import com.yuesheng.pattern.factory.entity.Milk;
import com.yuesheng.pattern.factory.entity.YiLi;

/**
 * 描述
 *
 * @author yuesheng
 * @date 2018/4/16 12:56
 */
public class SimpleMilkFactory {

    public Milk getMilk(String name) {
        if ("YiLi".equals(name)) {
            return getYiLi();
        }

        else if ("MenNiu".equals(name)) {
            return getMenNiu();
        }

        System.out.println("无法生产[" + name + "]");
        return null;
    }

    private Milk getYiLi() {
        return new YiLi();
    }

    private Milk getMenNiu() {
        return new MenNiu();
    }
}
