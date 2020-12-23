package Thread.MultiThread;

/**
 * @Author: lxy
 * @Date: 2020/12/23
 * @Description: Thread.MultiThread
 * @Version: 1.0
 */
public class Multi_Demo02 {

    public static void main(String[] args) {
        /*
            创建多线程第二种方法
            通过实现Runnable接口的子类，需要通过Thread类的构造方法来创建线程对象
            Thread(Runnable r)
            Thread(Runnable r, String name)

         */
        Runnable r1 = new RunPerson();
        Runnable r2 = new RunPerson();
        Runnable r3 = new RunPerson();
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2, "旺财");
        Thread t3 = new Thread(r3);
        t1.start();
        t2.start();
        t3.start();


    }
}
