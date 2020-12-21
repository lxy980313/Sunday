package Demo.Demo_AnnotationAndReflect;

/**
 * @Author: lxy
 * @Date: 2020/12/21
 * @Description: Demo.Demo_AnnotationAndReflect
 * @Version: 1.0
 */

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 简单的测试框架
 * 执行主方法后，会自动检测所有被Check修饰的方法，判断有没有异常，并打印在文件中
 */
public class TestMain {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        int number = 0;//记录第几次出现异常
        BufferedWriter bw = new BufferedWriter(new FileWriter("bug.txt"));//创建信息流，并将流记录到文件
        Calculator calculator = new Calculator();
        //1.反射获取Calculator的Class类对象
        Class cls = Class.forName("Demo.Demo_AnnotationAndReflect.Calculator");
        //2.获取方法
        Method[] methods = cls.getMethods();
        for (Method method : methods){
            //3.判断方法是否被Check注解修饰
            //*.isAnnotationPresent(a.class) 判断该方法上是否有a这个注解
            if(method.isAnnotationPresent(Check.class)){
                //4.有则执行
                try {
                    method.invoke(calculator);
                } catch (Exception e) {
                    //5.捕获异常
                    number++;
                    bw.write(method.getName()+"出现异常了!");
                    bw.newLine();
                    bw.write("异常的名称："+e.getCause().getClass().getSimpleName());
                    bw.newLine();
                    bw.write("异常名称："+e.getCause().getMessage());
                    bw.newLine();
                    bw.write("----------");
                    bw.newLine();
                }
            }
        }
        bw.write("本次测试一共出现"+number+"次异常");
        bw.flush();
        bw.close();
    }
}
