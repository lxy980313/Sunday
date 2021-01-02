package Thread.ThreadPool;

import java.util.concurrent.*;

/**
 * @Author: lxy
 * @Date: 2020/12/25
 * @Description: Thread.ThreadPool
 * @Version: 1.0
 */
public class ThreadPoolDemo01 {

    public static void main(String[] args) {
        //JDK1.5之后有一个用于生成线程池的内置类 java.util.concurrent.Executor
        //1.创建拥有n个线程的线程池,由于Executor里用于创建线程池的方法为静态方法，故不用创建对象
        ExecutorService es = Executors.newFixedThreadPool(3);
        //调用submit将线程任务传递到线程池，开启线程执行run里的任务
        /*
        es.submit(new ThreadPool());
        es.submit(new ThreadPool());
        es.submit(new ThreadPool());
        es.submit(new ThreadPool());
        es.submit(new ThreadPool());
        es.submit(new ThreadPool());
        es.submit(new ThreadPool());
        es.submit(new ThreadPool());
        es.submit(new ThreadPool());
        es.submit(new ThreadPool());
        //可以发现程序一直处在运行状态
        */

        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 5, 60,
                                                                            TimeUnit.SECONDS, new SynchronousQueue<Runnable>(),
                                                                            Executors.defaultThreadFactory(),
                                                                            new ThreadPoolExecutor.AbortPolicy());
        for(int i=0;i<10;i++) {
            threadPoolExecutor.execute(new ThreadPool());
        }
    }
}
