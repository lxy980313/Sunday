package reflect.ReflectDemo03;

import reflect.ReflectDemo01.Person;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @Author: lxy
 * @Date: 2020/12/20
 * @Description: reflect.ReflectDemo03
 * @Version: 1.0
 */

/*
    >2.获取成员方法
        * Method getMethod(String name, 类<?>... parameterTypes)
        * Method[] getMethods()
        * Method getDeclaredMethod(String name, 类<?>... parameterTypes)
        * Method[] getDeclaredMethods()
 */
public class Demo02 {

    public static void main(String[] args) throws Exception {
        //1.获取Person类的Class类对象
        Class personClass = Person.class;
        /*
                >2.获取成员方法
                    * Method getMethod(String name, 类<?>... parameterTypes)
                    * Method[] getMethods()
                    * Method getDeclaredMethod(String name, 类<?>... parameterTypes)
                    * Method[] getDeclaredMethods()
         */
        //获取指定名称的方法
        Method eat_method = personClass.getMethod("eat");
        //Object invoke(Object obj, Object... args) 调用需要真实的对象和参数
        Person person = new Person();
        //无参
        eat_method.invoke(person);
        //有参
        Method eat_method1 = personClass.getMethod("eat", String.class);
        eat_method1.invoke(person, "banana");

        System.out.println("------");

        //获取所有public修饰的方法
        Method[] methods = personClass.getMethods();
        for (Method method : methods){
            System.out.println(method);//由于Person的父类是Object类，故会把父类的public方法也打出来
            String name = method.getName();
            System.out.println(name);
        }
    }
}
