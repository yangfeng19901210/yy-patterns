package com.yy.singleton;
/**
 * 枚举实现单例模式(没有延时加载)
 * @ClassName LazySingletonEnum
 * @Author yangfeng
 * @Date 2025/9/10 17:00
 * @Version 1.0
 */
public enum LazySingletonEnum {
    INSTANCE;

    // 可以添加业务方法
    public void doSomething() {
    }
}
// 使用：LazySingletonEnum.INSTANCE.doSomething();