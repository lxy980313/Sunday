package reflect.ReflectDemo03;

import reflect.ReflectDemo01.Person;

/**
 * @Author: lxy
 * @Date: 2020/12/20
 * @Description: reflect.ReflectDemo03
 * @Version: 1.0
 */
public class Demo04 {

    public static void main(String[] args) {
        //1.获取Person类的Class类对象
        Class personClass = Person.class;
        String className = personClass.getName();
        System.out.println(className);
    }
}
