package Reflect.ReflectDemo03;

import Reflect.ReflectDemo01.Person;
import java.lang.reflect.Field;

/**
 * @Author: lxy
 * @Date: 2020/12/20
 * @Description: Reflect.ReflectDemo03
 * @Version: 1.0
 */

/*
    >1.获取成员变量
        * Field[] getFields()
        * Field getField(String name)
        * Field getDeclaredField(String name)
        * Field[] getDeclaredFields()
 */
public class Demo01 {

    public static void main(String[] args) throws Exception {
        //1.获取Person类的Class类对象
        Class personClass = Person.class;
        /*
                >1.获取成员变量
                    * Field[] getFields()
                    * Field getField(String name)
                    * Field getDeclaredField(String name)
                    * Field[] getDeclaredFields()
         */
        //2.Field[] getFields()，此方法用于获取所有public修饰的成员变量
        Field[] fields = personClass.getFields();
        for (Field field :fields){
            //public String a;
            System.out.println(field);//public java.lang.String Reflect.ReflectDemo01.Person.a
        }

        System.out.println("-------");
        //此时a是Field类的实例对象
        Field a = personClass.getField("a");
        //对比获取成员变量的值
        Person person = new Person();
        //直接 对象.变量，即person.a
        System.out.println(person.a);//null
        //get(Object obj)，由于形参为一个对象，故调用Field类对象的get方法必须要传入对象
        //可以理解为，Field类的实例对象操作的是对象的变量
        Object value = a.get(person);
        System.out.println(value);//null

        System.out.println("------");
        //Field类的实例对象操作的是对象的变量
        //将123赋值给person对象的变量
        a.set(person, "123");
        System.out.println(person);//Person{age=0, name='null', a='123', b='null', c='null', d='null'}

        System.out.println("------");
        //3.Field[] getDeclaredFields() 获取所有成员变量
        Field[] declaredFields = personClass.getDeclaredFields();
        for (Field declaredField : declaredFields){
            System.out.println(declaredField);
        }
        //Field getDeclaredField(String name)
        Field d = personClass.getDeclaredField("d");
        //怎么忽略访问权限修饰符的安全检查？
        //暴力反射
        d.setAccessible(true);
        Object value2 = d.get(person);
        System.out.println(value2);
    }
}
