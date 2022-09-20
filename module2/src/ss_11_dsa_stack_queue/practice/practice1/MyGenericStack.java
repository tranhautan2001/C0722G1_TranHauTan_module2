package ss_11_dsa_stack_queue.practice.practice1;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class MyGenericStack<T> {
    private LinkedList<T> stack;

    //Tạo lớp MyGenericStack với các thuộc tính:
    public MyGenericStack() {
        stack = new LinkedList<>();
    }
    //Cài đặt phương thức push()

    public void push(T element) {
        stack.addFirst(element);
    }

    //Cài đặt phương thức pop()
    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.removeFirst();

    }

    //Cài đặt phương thức size()
    public int sixizre() {
        return stack.size();
    }
    //Cài đặt phương thức isEmpty()

    public boolean isEmpty() {
        if (stack.size() == 0) {
            return true;
        }
        return false;
    }

    //    Cài đặt lớp GenericStackClient chứa hai phương thức stackOfStrings() và stackOfIntegers()
    private static void stackOfIStrings() {
        MyGenericStack<String> stack = new MyGenericStack();
        stack.push("Five");
        stack.push("Four");
        stack.push("Three");
        stack.push("Two");
        stack.push("One");
        System.out.println("1.1 Size of stack after push operations: " + stack.size());
        System.out.printf("1.2. Pop elements from stack : ");
        while (!stack.isEmpty()) {
            System.out.printf(" %s", stack.pop());
        }
        System.out.println("\n1.3. Size of stack after pop operations : " + stack.size());
    }

    private String size() {
        return null;
    }

    // Cài đặt phương thức
    private static void stackOfIntegers() {
        MyGenericStack<Integer> stack = new MyGenericStack();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println("2.1. Size of stack after push operations: " + stack.size());
        System.out.printf("2.2. Pop elements from stack : ");
        while (!stack.isEmpty()) {
            System.out.printf(" %d", stack.pop());
        }
        System.out.println("\n3.3 Size of stack after pop operations : " + stack.size());
    }


}
