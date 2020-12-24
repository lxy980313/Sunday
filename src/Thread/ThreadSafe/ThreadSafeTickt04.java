package Thread.ThreadSafe;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: lxy
 * @Date: 2020/12/24
 * @Description: Thread.ThreadSafe
 * @Version: 1.0
 */
public class ThreadSafeTickt04 implements Runnable{
    private int ticket=100;


    /*
        由于synchronized不知道线程对象什么时候获取锁，什么时候释放锁，经过改进，就有了Lock锁
        lock();获取锁
        unlock();释放锁
        由于Lock是个借口，并且ReentrantLock类承接Lock借口
        使用步骤：
        //1.创建ReentrantLock类实例对象
        //2.在要进行同步的代码块前进行调用lock
        //3.在要进行同步的代码块后进行调用unlock
     */
    Lock lock = new ReentrantLock();

    @Override
    public  void run() {
        while (true){
            lock.lock();
            if (ticket>0){
                try {
                    System.out.println(Thread.currentThread().getName()+"正在卖第"+ticket+"张票");
                    ticket--;
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    lock.unlock();
                }
            }
        }
    }
}
