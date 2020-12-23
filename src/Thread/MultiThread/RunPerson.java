package Thread.MultiThread;

/**
 * @Author: lxy
 * @Date: 2020/12/23
 * @Description: Thread.MultiThread
 * @Version: 1.0
 */
public class RunPerson implements Runnable{

    @Override
    public void run() {
        for (int i=0; i<20; i++){
            System.out.println(Thread.currentThread().getName()+"--->"+i);
        }
    }
}
