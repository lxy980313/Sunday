package Reflect.ReflectDemo03;

import Reflect.ReflectDemo01.Person;

import java.lang.reflect.Constructor;

/**
 * @Author: lxy
 * @Date: 2020/12/20
 * @Description: Reflect.ReflectDemo03
 * @Version: 1.0
 */

/*
    >3.获取构造方法
        * Constructor<T> getConstructor(类<?>... parameterTypes)
        * Constructor<?>[] getConstructors()
        * Constructor<T> getDeclaredConstructor(类<?>... parameterTypes)
        * Constructor<?>[] getDeclaredConstructors()
 */
public class Demo03 {

    public static void main(String[] args) throws Exception {
        //1.获取Person类的Class类对象
        Class personClass = Person.class;
        /*
                >3.获取构造方法
                    * Constructor<T> getConstructor(类<?>... parameterTypes)
                    * Constructor<?>[] getConstructors()
                    * Constructor<T> getDeclaredConstructor(类<?>... parameterTypes)
                    * Constructor<?>[] getDeclaredConstructors()
         */
        //2.Constructor<T> getConstructor(类<?>... parameterTypes) ，根据参数传递
        //获取构造器
        Constructor declaredConstructor = personClass.getDeclaredConstructor(int.class, String.class);
        System.out.println(declaredConstructor);
        //创建对象
        Object person = declaredConstructor.newInstance(20, "张三");
        System.out.println(person);

        System.out.println("------");

        //无参构造方法
        Constructor declaredConstructor1 = personClass.getDeclaredConstructor();
        System.out.println(declaredConstructor);
        //创建对象
        Object person1 = declaredConstructor.newInstance();
        System.out.println(person1);

        Object person3 = personClass.newInstance();
    }
}
