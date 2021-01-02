package Thread.LambdaDemo;

/**
 * @Author: lxy
 * @Date: 2020/12/25
 * @Description: Thread.LambdaDemo
 * @Version: 1.0
 */
public class LambdaDemoMain {
    public static void main(String[] args) {
        LambdaDemo01 demo01 = new LambdaDemo01();
        Thread thread = new Thread(demo01);
        thread.start();

        //匿名类
        Runnable r = new Runnable(){
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"创建了一个新的线程");
            }
        };
        new Thread(r).start();

        //lambda函数
        //构成
        //1.一些参数
        //2.一个箭头
        //3.一段代码
        //(参数) -> { 代码块 }  参数传递给代码块
        new Thread(()->{
            System.out.println("lambda表达式");
        }).start();
    }
}
