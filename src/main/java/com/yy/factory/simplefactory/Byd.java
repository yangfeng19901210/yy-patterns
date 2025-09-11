package com.yy.factory.simplefactory;
/**
 * 比亚迪车
 * @ClassName Byd
 * @Author yangfeng
 * @Date 2025/9/11 15:50
 * @Version 1.0
 */
public class Byd implements Car {

	@Override
	public void run() {
		System.out.println("比亚迪再跑！");
	}

}
