package com.yy.factory.simplefactory;

/**
 * 简单工厂方式二
 * @ClassName CarFactory2
 * @Author yangfeng
 * @Date 2025/9/11 15:51
 * @Version 1.0
 */
public class CarFactory2 {
	
	public static  Car createAudi(){
		return new Audi();
	}
	public static  Car createByd(){
		return new Byd();
	}
	
}
