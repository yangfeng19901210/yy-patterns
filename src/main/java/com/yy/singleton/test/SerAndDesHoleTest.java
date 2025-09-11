package com.yy.singleton.test;

import com.yy.singleton.lazy.LazySingleton03;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 序列化和反序列化漏洞测试
 * @ClassName SerAndDesHoleTest
 * @Author yangfeng
 * @Date 2025/9/11 11:24
 * @Version 1.0
 */
public class SerAndDesHoleTest {
    public static void main(String[] args) throws Exception {
        LazySingleton03 s1 = LazySingleton03.getInstance();
        LazySingleton03 s2 = LazySingleton03.getInstance();
        System.out.println(s1); //true
        System.out.println(s2);
        //将s1对象进行序列化
        FileOutputStream fos = new FileOutputStream("d:/a.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(s1);
        oos.close();
        fos.close();

        //将磁盘存储的文件进行反序列化
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d:/a.txt"));
        LazySingleton03 s3 = (LazySingleton03) ois.readObject();
        System.out.println(s3);
    }
}