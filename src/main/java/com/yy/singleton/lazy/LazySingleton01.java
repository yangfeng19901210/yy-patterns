package com.yy.singleton.lazy;
/**
 * 测试懒汉式单例模式
 * @ClassName LazySingleton01
 * @Author yangfeng
 * @Date 2025/9/10 11:48
 * @Version 1.0
 */
public class LazySingleton01 {
	
	//类初始化时，不初始化这个对象（延时加载，真正用的时候再创建）。
	private static LazySingleton01 instance;
	
	private LazySingleton01(){ //私有化构造器
	}
	
	//方法同步，调用效率低！
	public static  synchronized LazySingleton01 getInstance(){
		if(instance==null){
			instance = new LazySingleton01();
		}
		return instance;
	}
	
}
