package Annotation.AnnotationDemo03;

import java.lang.reflect.Method;

/**
 * @Author: lxy
 * @Date: 2020/12/21
 * @Description: Annotation.AnnotationDemo03
 * @Version: 1.0
 */

@MyAnn01(className = "Annotation.AnnotationDemo03.Demo01",methodName = "show")
public class test {
    /*
        在不改变任何代码的情况下，创建任意类对象，并执行其中的方法
     */
    public static void main(String[] args) throws Exception {

    //1.解析注解
    //1.1获取该类的Class类对象
    Class<test> testClass = test.class;
    //1.2获取注解
        //生成了一个该注解接口的子类实例对象，如下
    /*
        public class MyAnn01Impl implements MyAnn01{
            public String className(){
                return "Annotation.AnnotationDemo03.Demo01";
            }

        public String methodName(){
                return "show";
            }
        }
     */

    MyAnn01 annotation = testClass.getAnnotation(MyAnn01.class);
    //1.3调用注解对象中定义的抽象方法，获取返回值
    String className = annotation.className();
        System.out.println(className);
    String methodName = annotation.methodName();
        System.out.println(methodName);
    //3.反射加载该类
    Class cls = Class.forName(className);

    //4.创建对象
    Object obj = cls.newInstance();

    //5.获取方法对象
    Method method = cls.getMethod(methodName);

    //6.执行方法
    method.invoke(obj);
    }
}
