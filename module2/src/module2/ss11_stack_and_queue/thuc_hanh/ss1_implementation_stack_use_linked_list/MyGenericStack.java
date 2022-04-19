package module2.ss11_stack_and_queue.thuc_hanh.ss1_implementation_stack_use_linked_list;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class MyGenericStack<T> {
    private LinkedList<T> stack;

    public MyGenericStack(){
        stack = new LinkedList();
    }

    /**
     * phương thức thêm 1 phần tử
     */
    public void push(T element){
        stack.addFirst(element);
    }
    /**
     * phương thức xóa 1 phần tử
     */
    public T pop(){
        if (isEmpty()){
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }

    public boolean isEmpty(){
        if (stack.size()==0){
            return true;
        }
        return false;
    }

    public int size(){
        return stack.size();
    }
}
