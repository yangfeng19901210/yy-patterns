package com.yy.singleton.hungry;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
/**
 * 静态代码块（适合复杂的场景，如从配置文件读取所需参数）
 * @ClassName HungrySigleton02
 * @Author yangfeng
 * @Date 2025/9/9 17:44
 * @Version 1.0
 */
public class HungrySigleton02 {
   
    private HungrySigleton02(String info){
        System.out.println(info);
    }
    private  static HungrySigleton02 INSTANCE =null;
    static {
   
        Properties prop = new Properties();
        InputStream inStream = HungrySigleton02.class.getClassLoader().getResourceAsStream("project.properties");
        try {
            prop.load(inStream);
        } catch (IOException e) {
            e.printStackTrace();}
        String info =(String) prop.get("info");
        //扩展：读取配置文件的几种方式 1、Properties继承自Hashtable 2、ResourceBundle 3、Spring种利用ApplicationContext加载xml文件
         INSTANCE = new HungrySigleton02(info);
    }
    public static HungrySigleton02 getInstance(){
   
        return INSTANCE;
    }
}