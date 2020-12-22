package Collection.Iterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @Author: lxy
 * @Date: 2020/12/22
 * @Description: Collection.Iterator
 * @Version: 1.0
 */
/*
    Iterator<E>:
        boolean hasNext()
        E next()
 */

public class IteratorDemo01 {

    public static void main(String[] args) {
        //创建ArrayList集合
        ArrayList<Integer> itList = new ArrayList<>();
        //通过普通遍历像集合添加10个元素
        for(int i=0; i<10; i++){
            itList.add(i);
        }

        //创建迭代器Iterator<E>,集合里装的什么类型元素，迭代器自动对应类型
        Iterator<Integer> iterator = itList.iterator();
        /*
            //可以看出hasNext作用是判断集合中还有没有下一个元素
            boolean b = iterator.hasNext();
            System.out.println(b);//true
            //若有下一个元素，则取出下一个元素
            Integer next = iterator.next();
            System.out.println(next);//0
        */
        //优化
        //注意，创建迭代器时，hasNext()指向-1的位置
        System.out.println("迭代器遍历输出：");
        while (iterator.hasNext()){
            Integer next = iterator.next();
            System.out.print(next+" ");
        }

        //增强for循环（foreach）
        System.out.println();
        System.out.println("增强for循环输出：");
        for (Integer i : itList){
            System.out.print(i+" ");
        }

    }
}
