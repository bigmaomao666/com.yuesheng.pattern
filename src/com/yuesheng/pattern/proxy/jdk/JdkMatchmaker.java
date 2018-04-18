package com.yuesheng.pattern.proxy.jdk;

import com.yuesheng.pattern.proxy.staticed.Person;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * <p>代理类继承java.lang.reflect.InvocationHandler接口，实现invoke方法</p>
 * <p>通过java.lang.reflect.Proxy#newProxyInstance(java.lang.ClassLoader, java.lang.Class[], java.lang.reflect.InvocationHandler)
 * 获取一个被代理对象的代理对象，这个代理对象实现了被代理对象的所有接口(包括Object类的hashCode()、equals()、toString())的方法，
 * 方法内部实际调用的是代理类的invoke方法</p>
 *
 * @author yuesheng
 * @date 2018/4/17 12:30
 */
public class JdkMatchmaker implements InvocationHandler {

    private Person target;

    public Object getInstance(Person target) {
        this.target = target;

        Class<?> clazz = target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("开始物色");
        method.invoke(this.target, args);
        System.out.println("开始相亲");
        return null;
    }
}
