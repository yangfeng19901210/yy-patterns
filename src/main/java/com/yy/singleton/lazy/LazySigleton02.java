package com.yy.singleton.lazy;
/**
 * 懒汉式版本2（同步方法实现线程安全，但效率很低）
 * @ClassName LazySigleton02
 * @Author yangfeng
 * @Date 2025/9/10 14:13
 * @Version 1.0
 */
public class LazySigleton02 {
   
    private LazySigleton02(){
   
    }
    private  static LazySigleton02 INSTANCE =null;
    /**
     * 代码分析：
     * 优点：1.synchronized 关键字保证了方法级别的同步，防止多线程下创建多个实例
     * 2.实现了延迟加载，只有在第一次调用 getInstance 方法时才创建实例，节省了资源
     * 缺点：1.性能开销：每次调用 getInstance 方法时都需要获取锁，导致性能下降，尤其是在高并发环境下
     * 2.存在干扰代码：Thread.sleep(100); 这行代码在生产环境中完全无用，仅用于模拟并发延迟，应移除
     * 改进建议：
     * 1.首先，移除 Thread.sleep(100);。
     * 然后，为了提升性能，将同步的范围从整个方法缩小到仅初始化实例的关键部分。这引出了经典的双重检查锁（DCL, Double-Checked Locking） 模式 和静态内部类（Holder模式）
     * 双重检查锁请参考 LazySingletonDCL；静态内部类请参考LazySingletonHolder
     *
     */
    public synchronized static LazySigleton02 getInstance(){
        if(null == INSTANCE){
            INSTANCE = new LazySigleton02();
        }
        return INSTANCE;
    }
}