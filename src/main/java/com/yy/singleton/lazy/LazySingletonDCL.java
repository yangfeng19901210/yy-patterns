package com.yy.singleton.lazy;
/**
 * 双重检测锁懒汉模式
 * @ClassName LazySingletonDCL
 * @Author yangfeng
 * @Date 2025/9/10 14:21
 * @Version 1.0
 */
public class LazySingletonDCL {
    private LazySingletonDCL() {
    }

    // 使用volatile防止指令重排
    private static volatile LazySingletonDCL INSTANCE = null;

    public static LazySingletonDCL getInstance() {
        if (INSTANCE == null) { // 第一次检查：避免绝大多数不必要的同步
            synchronized (LazySingletonDCL.class) {
                if (INSTANCE == null) { // 第二次检查：确保线程安全
                    INSTANCE = new LazySingletonDCL();
                }
            }
        }
        return INSTANCE;
    }
}