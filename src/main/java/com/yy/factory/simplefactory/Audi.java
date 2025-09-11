package com.yy.factory.simplefactory;
/**
 * 奥迪车
 * @ClassName Audi
 * @Author yangfeng
 * @Date 2025/9/11 15:50
 * @Version 1.0
 */
public class Audi implements Car {

	@Override
	public void run() {
		System.out.println("奥迪再跑！");
	}

}
