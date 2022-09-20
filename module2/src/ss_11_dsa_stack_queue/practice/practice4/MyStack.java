package ss_11_dsa_stack_queue.practice.practice4;

import java.util.Stack;

public class MyStack {
    private int arr[];
    private int size;
    private int index;

    public MyStack(int size) {
        this.size = size;
        arr = new int[size];

    }
    public void push(int element){
        if (isFull()){
            throw new StackOverflowError("stack í full");
        }
        arr[index] = element;
        index++;
    }
    public int pop() throws Exception{
        if (isEmpty()){
            throw new Exception("stack is null");
        }
        return arr[--index];
    }
    public int size(){
        return index;
    }
    private boolean isEmpty() {
        if (index == 0){
            return true;
        }
        return false;
    }

    private boolean isFull() {
        if (index == size){
            return true;
        }
        return false;
    }

    public static void main(String[] as) throws Exception {
        MyStack stack = new MyStack(5);

        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);

        System.out.println("1. Size of stack after push operations: " + stack.size());
        System.out.printf("2. Pop elements from stack : ");

        while (!stack.isEmpty()) {
            System.out.printf(" %d", stack.pop());
        }

        System.out.println("\n3. Size of stack after pop operations : " + stack.size());
    }
}