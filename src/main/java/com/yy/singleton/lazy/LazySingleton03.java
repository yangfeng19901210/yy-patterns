package com.yy.singleton.lazy;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * 测试懒汉式单例模式
 * @ClassName LazySingleton01
 * @Author yangfeng
 * @Date 2025/9/10 11:48
 * @Version 1.0
 */
public class LazySingleton03 implements Serializable {

	//类初始化时，不初始化这个对象（延时加载，真正用的时候再创建）。
	private static LazySingleton03 instance;

	private LazySingleton03(){ //私有化构造器
		if(null!=instance){
			throw new RuntimeException("私有化构造器禁止实例化");
		}
	}
	
	//方法同步，调用效率低！
	public static  synchronized LazySingleton03 getInstance(){
		if(instance==null){
			instance = new LazySingleton03();
		}
		return instance;
	}
	// readResolve 方法确保反序列化返回唯一实例
	private Object readResolve() throws ObjectStreamException {
		return instance; // 返回单例实例
	}
	
}
