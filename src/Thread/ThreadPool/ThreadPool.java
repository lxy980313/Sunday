package Thread.ThreadPool;

/**
 * @Author: lxy
 * @Date: 2020/12/25
 * @Description: Thread.ThreadPool
 * @Version: 1.0
 */
public class ThreadPool implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"创建了一个新的线程");
    }
}
