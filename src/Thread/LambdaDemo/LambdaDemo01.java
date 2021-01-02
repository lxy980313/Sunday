package Thread.LambdaDemo;

/**
 * @Author: lxy
 * @Date: 2020/12/25
 * @Description: Thread.LambdaDemo
 * @Version: 1.0
 */
public class LambdaDemo01 implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"创建了一个新的线程");
    }
}
