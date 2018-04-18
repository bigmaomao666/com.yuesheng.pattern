package com.yuesheng.pattern.prototype.simple;

import java.util.List;

/**
 * <p>实现java.lang.Cloneable接口，使用Object的clone方法实现实例的复制</p>
 *
 * <p>只是重新创建一个实例，但是内部成员指向没有变化。
 * 修改clone后的实例内成员，可能会导致原实例内成员的改变。
 * 存在一定风险。</p>
 *
 * @author yuesheng
 * @date 2018/4/15 11:48
 */
public class SimplePrototype implements Cloneable {

    private String name;

    private Object body;

    private List<Object> objects;

    public SimplePrototype(String name, Object body, List<Object> objects) {
        this.name = name;
        this.body = body;
        this.objects = objects;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getBody() {
        return body;
    }

    public void setBody(Object body) {
        this.body = body;
    }

    public List<Object> getObjects() {
        return objects;
    }

    public void setObjects(List<Object> objects) {
        this.objects = objects;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
