package Reflect.ReflectDemo01;

/**
 * @Author: lxy
 * @Date: 2020/12/20
 * @Description: Reflect.rDemo01
 * @Version: 1.0
 */
public class Refle01_Demo01 {
    public static void main(String[] args) throws ClassNotFoundException {
        Person person = new Person();
        //对应代码的第一个阶段，通过代码的全类名，将代码的字节码信息加载到内存当中
        //多用于配置文件中
        Class<?> c1 = Class.forName("Reflect.ReflectDemo01.Person");
        System.out.println(c1);//class Reflect.rDemo01.Person

        //对应代码的第二个阶段，此时代码的字节码信息已经加载到内存当中，通过类名.class
        //多用于参数传递
        Class<Person> c2 = Person.class;
        System.out.println(c2);

        //对应代码的第三个阶段，此时已生成实例对象，根据实例对象的方法.getClass()获取
        //多用于对象的字节码获取
        Class<?> c3 = person.getClass();
        System.out.println(c3);

        System.out.println(c1 == c2);//true
        System.out.println(c1 == c3);//true
        /*
            结论：同一个.class文件在一次程序运行过程中，只会被加载一次，不论采用什么方式去获取Class类对象，都是指的同一个
         */

    }
}
