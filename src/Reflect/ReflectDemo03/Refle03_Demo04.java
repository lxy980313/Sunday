package Reflect.ReflectDemo03;


import Reflect.ReflectDemo01.Person;

/**
 * @Author: lxy
 * @Date: 2020/12/20
 * @Description: Reflect.ReflectDemo03
 * @Version: 1.0
 */
public class Refle03_Demo04 {

    public static void main(String[] args) {
        //1.获取Person类的Class类对象
        Class personClass = Person.class;
        String className = personClass.getName();
        System.out.println(className);
    }
}
