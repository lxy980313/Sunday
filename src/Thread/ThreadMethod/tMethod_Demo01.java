package Thread.ThreadMethod;

/**
 * @Author: lxy
 * @Date: 2020/12/23
 * @Description: Thread.ThreadMethod
 * @Version: 1.0
 */

/**
 * 1.获取线程名称
 *      String getName(),返回该线程的名称
 * 2.获取当前正在执行的线程，使用线程中的方法getName()获取线程的名称
 *      currentThread(),返回的正在执行的线程对象的引用
 * 3.改变线程的名称
 *      void setName(String name)
 *
 * 4.sleep(ms);
 *      该方法让线程沉睡ms毫秒
 *      Thread.sleep()
 */
public class tMethod_Demo01 {

    public static void main(String[] args) {
        Thread t1 = new MT();
        Thread t2 = new MT();
        Thread t3 = new MT();
        //可以发现输出具有随机性，说明此事CPU是随机执行线程
        System.out.println("我是"+Thread.currentThread().getName());//我是main
        t1.start();//我是Thread-1
        t2.start();//我是Thread-2
        t3.start();//我是Thread-3

        System.out.println("----------");
        Thread t4 = new MT();
        Thread t5 = new MT();
        Thread t6 = new MT();
        //改变线程名称
        t4.setName("小强一号");
        t5.setName("小强二号");
        t6.setName("小强三号");

        t4.start();//我是Thread-1
        t5.start();//我是Thread-2
        t6.start();//我是Thread-3


        Thread t7 = new MT("旺财一号");
        Thread t8 = new MT("旺财二号");
        Thread t9 = new MT("旺财三号");

        t7.start();//我是Thread-1
        t8.start();//我是Thread-2
        t9.start();//我是Thread-3
    }
}
