package ss11_stack_and_queue.bai_tap.ss1_invert_element_use_stack;

import java.util.LinkedList;
import java.util.Stack;

public class InvertElement<T> {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack);
        Stack<Integer> wStack = new Stack<>();
        wStack.push(stack.pop());
        wStack.push(stack.pop());
        wStack.push(stack.pop());
        wStack.push(stack.pop());
        wStack.push(stack.pop());
        System.out.println(stack);
        System.out.println(wStack);
    }
}
