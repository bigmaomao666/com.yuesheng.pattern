package com.yuesheng.pattern.factory.func;

import com.yuesheng.pattern.factory.entity.Milk;

/**
 * 描述
 *
 * @author yuesheng
 * @date 2018/4/16 13:02
 */
public interface MilkFactory {

    /**
     * 获取牛奶
     *
     * @return
     */
    Milk getMilk();
}
