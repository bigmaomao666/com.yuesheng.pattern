package com.yuesheng.pattern.factory.abstr;

import com.yuesheng.pattern.factory.entity.MenNiu;
import com.yuesheng.pattern.factory.entity.Milk;
import com.yuesheng.pattern.factory.entity.YiLi;

/**
 * 描述
 *
 * @author yuesheng
 * @date 2018/4/16 13:08
 */
public class MilkFactory extends AbstractMilkFactory {
    @Override
    public Milk getYiLi() {
        return new YiLi();
    }

    @Override
    public Milk getMenNiu() {
        return new MenNiu();
    }
}
