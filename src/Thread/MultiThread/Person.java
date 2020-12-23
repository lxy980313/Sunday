package Thread.MultiThread;

/**
 * @Author: lxy
 * @Date: 2020/12/23
 * @Description: Thread.MainThread
 * @Version: 1.0
 */
public class Person extends Thread{
    private String name;

    @Override
    public void run(){
        //执行10次
        for (int i=0; i<10; i++){
            System.out.println("我是"+name+"--->"+i);
        }
    }

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

}
