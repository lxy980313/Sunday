package Collection.Map;

/**
 * @Author: lxy
 * @Date: 2020/12/22
 * @Description: Collection.Map
 * @Version: 1.0
 */

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Map的遍历
 */
public class MapDemo02 {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "一");
        map.put(2, "二");
        map.put(3, "三");
        map.put(4, "四");
        map.put(5, "五");

        System.out.println("第一种遍历方法：通过键找值keySet()方法，再用迭代器");
        //Map中带有一个keySet()方法
        Set<Integer> keySet = map.keySet();
        //遍历Set
        Iterator<Integer> itKey = keySet.iterator();
        while (itKey.hasNext()){
            Integer key = itKey.next();
            String value = map.get(key);
            System.out.println("key:"+key+" <--> value:"+value);
        }
        System.out.println("------------");
        System.out.println("第二种遍历方法：通过键找值keySet()方法，再用增强for");
        for (Integer key : keySet){
            String value = map.get(key);
            System.out.println("key:"+key+" <--> value:"+value);
        }
        System.out.println("------------");
        System.out.println("第三种遍历方法：通过Entry<k, v>");
        //Map内有个Entry<K, V>接口，当调用该接口的实现类方法之后，会返回一个Map.Entry<Integer, String>类对象，该对象表示map里的键值对
        //将映射关系对象存放到Set集合中
        Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
        //创建迭代器遍历set
        Iterator<Map.Entry<Integer, String>> iterator = entrySet.iterator();
        while (iterator.hasNext()){
            Map.Entry<Integer, String> entry = iterator.next();
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println("key:"+key+" <--> value:"+value);
        }
    }
}
