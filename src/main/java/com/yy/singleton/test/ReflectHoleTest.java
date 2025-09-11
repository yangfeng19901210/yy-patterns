package com.yy.singleton.test;

import com.yy.singleton.lazy.LazySingleton01;

import java.lang.reflect.Constructor;

/**
 * 反射漏洞测试
 * @ClassName ReflectHoleTest
 * @Author yangfeng
 * @Date 2025/9/11 11:03
 * @Version 1.0
 */
public class ReflectHoleTest {
    public static void main(String[] args) throws Exception{
        LazySingleton01 instance1 = LazySingleton01.getInstance();
        LazySingleton01 instance2 = LazySingleton01.getInstance();
        System.out.println(instance1);
        System.out.println(instance2);

        System.out.println("开始进行发射测试--------");
        Class<LazySingleton01> clazz = (Class<LazySingleton01>) Class.forName("com.yy.singleton.lazy.LazySingleton01");
        //获取无参构造器
        Constructor<LazySingleton01> c = clazz.getDeclaredConstructor(null);
        c.setAccessible(true);
        LazySingleton01 ci1 = c.newInstance(null);
        LazySingleton01 ci2 = c.newInstance(null);
        System.out.println(ci1);
        System.out.println(ci2);
    }
}