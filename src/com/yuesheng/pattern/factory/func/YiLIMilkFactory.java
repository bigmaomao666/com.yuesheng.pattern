package com.yuesheng.pattern.factory.func;

import com.yuesheng.pattern.factory.entity.Milk;
import com.yuesheng.pattern.factory.entity.YiLi;

/**
 * 描述
 *
 * @author yuesheng
 * @date 2018/4/16 13:03
 */
public class YiLIMilkFactory implements MilkFactory {

    @Override
    public Milk getMilk() {
        return new YiLi();
    }
}
