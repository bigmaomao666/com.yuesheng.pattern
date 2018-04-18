package com.yuesheng.pattern.proxy.jdk;

import com.yuesheng.pattern.proxy.staticed.Person;

/**
 * 描述
 *
 * @author yuesheng
 * @date 2018/4/17 12:22
 */
public class WangXiao implements Person{

    public void findNewLove() {
        System.out.println("new love");
    }

    @Override
    public void findLove() {
        System.out.println("肤白");
        System.out.println("貌美");
        System.out.println("大长腿");
    }

    @Override
    public void rentApartment() {
        System.out.println("宽敞");
        System.out.println("明亮");
        System.out.println("价格低");
    }
}
