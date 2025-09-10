package com.yy.singleton.hungry;

/**
 * 静态常量示例化方式：在类加载时立即初始化实例
 *
 * @ClassName HungrySingleton
 * @Author yangfeng
 * @Date 2025/9/9 17:35
 * @Version 1.0
 */
public class HungrySingleton01 {
    //1.定义静态常量
    //优点：jvm在加载类时是线程安全的，所以不存在线程安全问题
    private static HungrySingleton01 instance = new HungrySingleton01();

    //2.私有化构造器
    private HungrySingleton01(){}

    //3.提供全局访问点：提供获取唯一实例的静态方法
    public static HungrySingleton01 getInstance(){
        return instance;
    }
}