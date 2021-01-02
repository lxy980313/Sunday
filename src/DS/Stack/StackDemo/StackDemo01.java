package DS.Stack.StackDemo;

import java.util.Stack;

/**
 * @Author: lxy
 * @Date: 2020/12/24
 * @Description: DS.Stack.StackDemo
 * @Version: 1.0
 */
public class StackDemo01 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        for (Integer i : stack){
            System.out.println(i);
        }

        System.out.println("------");

        while (!stack.empty()){
            System.out.println(stack.pop());
        }
    }
}
