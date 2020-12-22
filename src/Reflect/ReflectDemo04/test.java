package Reflect.ReflectDemo04;

import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @Author: lxy
 * @Date: 2020/12/21
 * @Description: Reflect.ReflectDemo04
 * @Version: 1.0
 */
public class test {

    public static void main(String[] args) throws Exception {
        //设置配置文件，将类的全类名和方法名放入*.properites
        //1.1创建Properites对象
        Properties properties = new Properties();
        //1.2加载配置文件，转换为一个集合
        //1.2.1获取类加载器，在载入内存的时候，是由加载器载入的，加载器里有此项目所有文件的记录
        ClassLoader classLoader = test.class.getClassLoader();
        //1.2.2获取配置文件路劲的输入流,要输入配置文件全类名
        InputStream resourceAsStream = classLoader.getResourceAsStream("Reflect/ReflectDemo04/pro.properties");
        //1.2.3加载配置文件
        properties.load(resourceAsStream);

        //2.获取配置文件中数据
        String className = properties.getProperty("className");
        String methodName = properties.getProperty("methodName");

        //3.反射加载该类
        Class cls = Class.forName(className);

        //4.创建对象
        Object obj = cls.newInstance();

        //5.获取方法对象
        Method method = cls.getMethod(methodName);

        //6.执行方法
        method.invoke(obj);

        //7.更改配置文件里的代码即可
    }
}
