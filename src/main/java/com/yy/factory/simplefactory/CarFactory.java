package com.yy.factory.simplefactory;
/**
 * 简单工厂方式一
 * @ClassName CarFactory
 * @Author yangfeng
 * @Date 2025/9/11 15:50
 * @Version 1.0
 */
public class CarFactory {
	
	public static  Car createCar(String type){
		if("奥迪".equals(type)){
			return new Audi();
		}else if("比亚迪".equals(type)){
			return new Byd();
		}else{
			return null;
		}
	}
	
}
