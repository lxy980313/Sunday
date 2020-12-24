package Thread.ThreadSafe;

/**
 * @Author: lxy
 * @Date: 2020/12/24
 * @Description: Thread.ThreadSafe
 * @Version: 1.0
 */
public class ThreadSafeTickt implements Runnable{
    //定义共享数据
    private int ticket = 100;
    //创建锁对象
    Object object = new Object();

    //设置线程任务
    //模拟售票窗口，卖票
    /*
        //出现线程安全问题的代码
        @Override
        public void run() {
            while (ticket>0){
                //卖票，卖一张少一张
                System.out.println(Thread.currentThread().getName()+"正在卖第"+ticket+"张票");
                ticket--;
            }
        }
     */
    //解决线程安全问题
    //synchronized的使用
    //方法1；
    //创建锁对象synchronized (object)
    @Override
    public  void run() {
        while (ticket>2){
            //有t1,t2,t3三个线程
            //1.t1线程抢到CPU按照顺序执行代码，当碰到synchronized时，若存在锁对象object，t1则获取这个对象锁，t1获取之后synchronized的对象锁就暂时消失
            //2.此时t2也抢到CPU来执行线程任务，当碰到synchronized时，发现synchronized里的对象没有了（t1拿走了，相当于钥匙被拿走了），没有对象锁就进不了同步代码块，于是t2进入阻塞状态
            //3.t1执行完任并出了同步代码块，就会归还锁对象，此时synchronized又有锁对象了，后面随抢到锁就执行同步代码块
            synchronized (object){
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
