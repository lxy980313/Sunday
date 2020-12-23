package Thread.MultiThread;

/**
 * @Author: lxy
 * @Date: 2020/12/23
 * @Description: Thread.MultiThread
 * @Version: 1.0
 */
public class Multi_Demo01 {

    public static void main(String[] args) {
        /*
            创建多线程第一种方法
         */
        //1.创建一个Thread的子类,见Person类
        //2.在子类中重写Thread类中的run方法，并设置线程任务，即run方法里的代码
        //3.创建Thread类的子类对象（创建线程）(多态)
        Thread t1 = new Person("阿黄");
        Thread t2 = new Person("小红");
        //4.调用Thread类中的start方法，使该线程开始执行，jvm调用该线程鹅run方法
        //t1.start()和t1.run的区别()
        /**
         * t1.run();只是调用了run方法，但是还是在main单线程里执行，此时只有一个main线程栈
         * t1.start();方法则是调用的本地方法，本地方在内存中划分出一个t1线程栈空间，在该线程空间中执行run方法
         * 当有了多线程栈后，根据java的线程调度性质(抢占式调度)，CPU就有了选择权利，就会出现随机打印
         */
        t1.start();
        t2.start();
        for (int i=0; i<10; i++){
            System.out.println("我是Main--->"+i);
        }
    }
}
