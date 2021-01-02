package DS.Stack.StackTest.StackTest02;

import java.util.Stack;

/**
 * @Author: lxy
 * @Date: 2020/12/24
 * @Description: DS.Stack.StackTest.StackTest02
 * @Version: 1.0
 */
public class StackTest02 {

    public static Object[] test(Stack<?> t){
        Stack<?> stack = t;
        int len = t.size();
        Object[] obj = new Object[len];
        for (int i=0; i<len; i++){
            Object pop = stack.pop();
            obj[i] = pop;
        }
        return obj;
    }
}
