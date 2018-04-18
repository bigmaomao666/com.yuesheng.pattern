package com.yuesheng.pattern.prototype.deep;

import java.io.*;
import java.util.Date;
import java.util.List;

/**
 * 描述
 *
 * @author yuesheng
 * @date 2018/4/15 17:36
 */
public class DeepPrototype implements Serializable {

    private String name;

    private DeepPrototype body;

    private List<DeepPrototype> objects;

    public DeepPrototype() {
    }

    public DeepPrototype(String name, DeepPrototype body, List<DeepPrototype> objects) {
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

    public void setBody(DeepPrototype body) {
        this.body = body;
    }

    public List<DeepPrototype> getObjects() {
        return objects;
    }

    public void Date(List<DeepPrototype> objects) {
        this.objects = objects;
    }

    public Object deepClone() {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        try {
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            return ois.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
