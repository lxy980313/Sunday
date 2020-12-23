package Thread.ThreadMethod;

/**
 * @Author: lxy
 * @Date: 2020/12/23
 * @Description: Thread.ThreadMethod
 * @Version: 1.0
 */
public class MT extends Thread{

    public MT(){
        super();
    }

    //通过构造方法，调用父类的构造方法来达到改名效果
    public MT(String name){
        super(name);
    }

    @Override
    public void run() {
        System.out.println("我是"+Thread.currentThread().getName());
    }
}
