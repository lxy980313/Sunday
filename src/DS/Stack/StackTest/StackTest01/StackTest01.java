package DS.Stack.StackTest.StackTest01;

import java.util.HashMap;
import java.util.Stack;

/**
 * @Author: lxy
 * @Date: 2020/12/24
 * @Description: DS.Stack.StackTest
 * @Version: 1.0
 */
public class StackTest01 {
    public static boolean isTrue(String s){
        if (s.length()%2 != 0){
            return false;
        }
        //将字符串转换为数组
        char[] chars = s.toCharArray();
        //创建栈
        Stack<Character> stack = new Stack<>();
        //由于括号的特性，创建键值对
        HashMap<Character,Character> map = new HashMap<>();
        //4.首先判断是不是'(','[','{'中的一种，若是则入栈，否则就是')',']','}'中的一种
        //5.若将'(','[','{'作为k值，map.get(c)是')',']','}'
        //6.而stack.pop()总是'(','[','{',
        //7.当字符是')',']','}'中的一种时，就不会采取入栈，进行map.get()和栈顶的元素进行比较，而map.get()中的参数是key值，而给定的map没有以')',']','}'为key的元素
        //8.所以只能将')',']','}'作为key值
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');
        //遍历数组，将元素入栈
        for (char c : chars){
            //首先看该元素是不是'(','[','{'这三个元素,是就入栈
            if (map.containsValue(c)){
                stack.push(c);
            }
            //不是
            //先判断栈里是否有元素,有元素则比较，否则直接放回false
            //有元素       false  false    false  true
            //  1.该元素必是')',']','}'中的一种，只有'(','[','{'才会入栈
            //  2.弹出栈顶元素，
            //  3.获取该元素对应的value值，map.get(c)，得到的是'(','[','{'
            //  4.判断栈顶元素和该元素对应的value值是否相等
            //  5.若不相等则执行返回语句
            //
            //没有元素true
            //  1.当栈里没有元素时，若还有元素能进行次步骤，说明该元素必是')',']','}'中的一种
            //  2.此时栈内已空，没有与之配对的项，执行返回语句
            else if ( stack.empty() || !(map.get(c).equals(stack.pop()))){
                return false;
            }
        }
        //若全部元素遍历完后，为空则说明都有配对，否则会有多余的'(','[','{'没有配对项
        return stack.empty();
    }
}
