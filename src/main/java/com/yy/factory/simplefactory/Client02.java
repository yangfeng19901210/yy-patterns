package com.yy.factory.simplefactory;

/**
 * 使用设计模式下的客户端调用
 * @ClassName Client02
 * @Author yangfeng
 * @Date 2025/9/11 15:52
 * @Version 1.0
 */
public class Client02 {   //调用者
	
	public static void main(String[] args) {
		Car c1 =CarFactory.createCar("奥迪");
		Car c2 = CarFactory.createCar("比亚迪");
		
		c1.run();
		c2.run();
		
	}
}
