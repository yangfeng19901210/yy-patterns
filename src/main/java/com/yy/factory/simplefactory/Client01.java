package com.yy.factory.simplefactory;

/**
 * 不是用设计模式情况下调用测试
 * @ClassName Client01
 * @Author yangfeng
 * @Date 2025/9/11 15:52
 * @Version 1.0
 */
public class Client01 {   //调用者
	
	public static void main(String[] args) {
		Car c1 = new Audi();
		Car c2 = new Byd();
		
		c1.run();
		c2.run();
		
	}
}
