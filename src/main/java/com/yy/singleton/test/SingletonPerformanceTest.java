package com.yy.singleton.test;

import com.yy.singleton.LazySingletonEnum;
import com.yy.singleton.LazySingletonHolder;
import com.yy.singleton.hungry.HungrySigleton03;
import com.yy.singleton.hungry.HungrySingleton01;
import com.yy.singleton.lazy.LazySingleton01;
import com.yy.singleton.lazy.LazySingletonDCL;

import java.util.concurrent.CountDownLatch;

/**
 * 单例模式性能测试
 * @ClassName SingletonPerformanceTest
 * @Author yangfeng
 * @Date 2025/9/11 13:44
 * @Version 1.0
 */
public class SingletonPerformanceTest {
    public static void main(String[] args) throws Exception {

        long start = System.currentTimeMillis();
        int threadNum = 10;
        final CountDownLatch  countDownLatch = new CountDownLatch(threadNum);

        for(int i=0;i<threadNum;i++){
            new Thread(new Runnable() {
                @Override
                public void run() {

                    for(int i=0;i<1000000;i++){
//						Object o = LazySingletonHolder.getInstance();
                        Object o = LazySingletonEnum.INSTANCE;
                    }

                    countDownLatch.countDown();
                }
            }).start();
        }

        countDownLatch.await();	//main线程阻塞，直到计数器变为0，才会继续往下执行！

        long end = System.currentTimeMillis();
        System.out.println("总耗时："+(end-start));
    }
}