package com.yuesheng.pattern.proxy.staticed;

/**
 * 描述
 *
 * @author yuesheng
 * @date 2018/4/16 21:15
 */
public class Son implements Person{
    @Override
    public void findLove() {
        System.out.println("找个肤白貌美大长腿！");
    }

    @Override
    public void rentApartment() {
        System.out.println("租个房大安静租金少");
    }
}
