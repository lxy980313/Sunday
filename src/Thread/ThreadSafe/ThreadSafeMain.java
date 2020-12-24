package Thread.ThreadSafe;

import java.util.Stack;

/**
 * @Author: lxy
 * @Date: 2020/12/24
 * @Description: Thread.ThreadSafe
 * @Version: 1.0
 */
public class ThreadSafeMain {

    public static void main(String[] args) {
        //实例线程任务对象
        Runnable run = new ThreadSafeTickt();
        Runnable run1 = new ThreadSafeTickt02();
        //创建一个线程，该线程用于执行run里的任务
        Thread t1 = new Thread(run);
        Thread t2 = new Thread(run);
        Thread t3 = new Thread(run);
        t1.setName("1号窗口");
        t2.setName("2号窗口");
        t3.setName("3号窗口");

        t1.start();
        t2.start();
        t3.start();

    }
}
