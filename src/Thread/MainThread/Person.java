package Thread.MainThread;

/**
 * @Author: lxy
 * @Date: 2020/12/23
 * @Description: Thread.MainThread
 * @Version: 1.0
 */
public class Person {
    private String name;

    public void run(){
        //执行10次
        for (int i=0; i<10; i++){
            System.out.println(name+"--->"+i);
        }
    }

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
