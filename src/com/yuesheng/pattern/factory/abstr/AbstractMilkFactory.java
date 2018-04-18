package com.yuesheng.pattern.factory.abstr;

import com.yuesheng.pattern.factory.entity.Milk;

/**
 * 描述
 *
 * @author yuesheng
 * @date 2018/4/16 13:06
 */
public abstract class AbstractMilkFactory {

    public abstract Milk getYiLi();

    public abstract Milk getMenNiu();
}
