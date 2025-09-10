package com.yy.singleton.test;

import com.yy.singleton.LazySingletonHolder;

import java.util.concurrent.*;

/**
 * 内部类单例模式测试类
 * 通过多线程的方式进行测试
 * @ClassName LazySingletonHolderTest
 * @Author yangfeng
 * @Date 2025/9/10 17:36
 * @Version 1.0
 */
public class LazySingletonHolderTest {
    public static void main(String[] args) throws InterruptedException, ExecutionException {

        ExecutorService exec = Executors.newFixedThreadPool(2);
        Callable task = new Callable(){

            @Override
            public Object call() {

                LazySingletonHolder instance = LazySingletonHolder.getInstance();
                System.out.println(Thread.currentThread().getName()+instance);
                return instance;
            }
        };
        Future f1 = exec.submit(task);
        Future f2 = exec.submit(task);
        LazySingletonHolder l1 = (LazySingletonHolder) f1.get(),l2 = (LazySingletonHolder) f2.get();
        System.out.println("l1:" + l1);
        System.out.println("l2:" + l2);
        System.out.println(l1==l2);
        exec.shutdown();
    }
}