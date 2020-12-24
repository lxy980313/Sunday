package Thread.ThreadSafe;

/**
 * @Author: lxy
 * @Date: 2020/12/24
 * @Description: Thread.ThreadSafe
 * @Version: 1.0
 */
public class ThreadSafeTickt03 implements Runnable{

    //解决线程安全问题
    //静态代码块的使用
    private static int ticket = 100;

    /**
     * 此时静态的同步方法的对象锁不是this对象了，因为在ThreadSafeTickt03类对象创建之前，就已经存在静态方法了
     * 所以此时的锁对象是该类的Class类对象
     */
    @Override
    public  void run() {
        System.out.println("this:"+this);
        while (true){
            saleTicket();
        }
    }

    public static  void saleTicket(){
        synchronized(ThreadSafeTickt03.class){
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
}
