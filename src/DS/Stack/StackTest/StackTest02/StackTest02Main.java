package DS.Stack.StackTest.StackTest02;

/**
 * @Author: lxy
 * @Date: 2020/12/24
 * @Description: DS.Stack.StackTest.StackTest02
 * @Version: 1.0
 */

import java.util.Stack;

/**LeetCode
 * 232.栈实现队列的功能
 */
public class StackTest02Main {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        for (int i=0; i<10; i++){
            stack.push(i);
        }
        Object[] test = StackTest02.test(stack);
        for (Object o : test){
            System.out.println(o);
        }
    }
}
