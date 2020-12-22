package Collection.Map;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: lxy
 * @Date: 2020/12/22
 * @Description: Collection.Map
 * @Version: 1.0
 */

/**
 * Map方法的用法
 */
public class MapDemo01 {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        //put(k, v)返回一个和v类型一样的值，返回值表示被v替代了
        String a = map.put(1, "一");
        map.put(2, "二");
        map.put(3, "三");
        map.put(4, "四");
        String a1 = map.put(1, "1");
        System.out.println(a);//null,null被替换成"一"，也表明key值不重复
        System.out.println(a1);//"一"，表示key值重复，并且用“1”替换了“一”

        System.out.println("------");

        String a3 = map.remove(1);//删除指定key的键值对,返回该key值对应的value
        boolean b = map.remove(2, "二");//删除指定的key-value，返回一个bool表示是否删除成功
        System.out.println(a3);//1
        System.out.println(b);//true

        System.out.println("------");

        String a4 = map.get(3);//获取指定key值的value值
        System.out.println(a4);
    }
}
