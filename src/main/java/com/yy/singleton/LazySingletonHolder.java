package com.yy.singleton;
/**
 * 静态内部类单例模式
 * 线程安全，调用效率高，并且实现了延时加载
 * @ClassName LazySingletonHolder
 * @Author yangfeng
 * @Date 2025/9/10 14:22
 * @Version 1.0
 */
public class LazySingletonHolder {
    private LazySingletonHolder() {
    }

    private static class Holder {
        private static final LazySingletonHolder INSTANCE = new LazySingletonHolder();
    }

    public static LazySingletonHolder getInstance() {
        return Holder.INSTANCE;
    }
}