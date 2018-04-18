package com.yuesheng.pattern.proxy.jdk;

import com.yuesheng.pattern.proxy.staticed.Person;
import sun.misc.ProxyGenerator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 描述
 *
 * @author yuesheng
 * @date 2018/4/17 12:36
 */
public class JDKProxyTest {

    public static void main(String[] args) {
        Person person = (Person) new JdkMatchmaker().getInstance(new WangXiao());
        System.out.println(person.getClass());
        person.findLove();

        byte[] bytes = ProxyGenerator.generateProxyClass("$Proxy0", new Class[]{Person.class});
        FileOutputStream fos = null;
        try {

            fos =new FileOutputStream(JDKProxyTest.class.getResource("").getPath() +  "$Proxy0.class");
            fos.write(bytes);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
