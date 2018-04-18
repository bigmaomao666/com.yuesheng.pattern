package com.yuesheng.pattern.proxy.cglib;

import com.yuesheng.pattern.proxy.staticed.Person;

/**
 * 描述
 *
 * @author yuesheng
 * @date 2018/4/17 13:02
 */
public class ZhangSan extends AbstractPerson {

    @Override
    public void findNewLove() {
        System.out.println("new love");
    }


}

abstract class AbstractPerson implements Person {

    public abstract void findNewLove();

    @Override
    public void findLove() {
        System.out.println("肤白貌美大长腿");
    }

    @Override
    public void rentApartment() {
        System.out.println("租房子");
    }
}
