package Thread.ThreadSafe;

/**
 * @Author: lxy
 * @Date: 2020/12/24
 * @Description: Thread.ThreadSafe
 * @Version: 1.0
 */
public class ThreadSafeTickt02 implements Runnable{
    //定义共享数据
    private int ticket = 100;

    //解决线程安全问题
    //synchronized的使用
    //方法2；
    //用synchronized修饰方法代码块，此时就是将this作为对象锁
    /**
     * 此时的对象锁就是this，谁调用saleTicket()方法，谁就是对象锁
     */

    @Override
    public  void run() {
        System.out.println("this:"+this);
        while (true){
            saleTicket();
        }
    }

    public synchronized void saleTicket(){
        if (ticket>0){
            System.out.println(Thread.currentThread().getName()+"正在卖第"+ticket+"张票");
            ticket--;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    /*
    public  void saleTicket(){
        synchronized(this){
            if (ticket>0){
            System.out.println(Thread.currentThread().getName()+"正在卖第"+ticket+"张票");
            ticket--;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        }
    }
     */
}
