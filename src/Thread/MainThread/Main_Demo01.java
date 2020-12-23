package Thread.MainThread;

/**
 * @Author: lxy
 * @Date: 2020/12/23
 * @Description: Thread.MainThread
 * @Version: 1.0
 */
public class Main_Demo01 {
    public static void main(String[] args) {
        Person p1 = new Person("小强");
        p1.run();
        //后面的代码都会停止运行
        System.out.println(0/0);
        Person p2 = new Person("旺财");
        p2.run();
    }
}
