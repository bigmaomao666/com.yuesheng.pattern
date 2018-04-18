package com.yuesheng.pattern.proxy.staticed;

/**
 * 描述
 *
 * @author yuesheng
 * @date 2018/4/16 21:17
 */
public class Farther {

    private Son son;

    public Farther(Son son) {
        this.son = son;
    }

    public void findLove() {
        System.out.println("开始物色");
        son.findLove();
        System.out.println("找到了");
    }

    public void rentApartment() {
        System.out.println("开始看放房子");
        son.rentApartment();
        System.out.println("准备入住");
    }
}
