package ss_11_dsa_stack_queue.exercis.exercis1;

import java.util.Arrays;
import java.util.Stack;

public class ReverseStack {


    //cách 1: Đảo ngược phần tử trong mảng số nguyên sử dụng Stack

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> reverse = new Stack<>();

        for (int i = 0; i < 6; i++) {
            stack.push(i);
        }

        System.out.println("mảng stack là: " + stack);
        for (int i = 0; i < stack.size() + i; i++) {
            reverse.push(stack.pop());
        }

        System.out.println("sau khi đảo ngược stack: " + reverse);

    }



    // cách 2 Đảo ngược phần tử trong mảng số nguyên sử dụng Stack


//    public static void main(String[] args)
//    {
//        int n = 5;
//
//        Stack<Integer> s = new Stack<Integer>();
//        for (int i = 0; i <=n; i++) {
//            s.push(i);
//        }
//
//        for(int i = 0; i < n; i++)
//        {
//            System.out.print(s.peek() + " ");
//            s.pop();
//        }
//    }
//}

    //cách 1: Đảo ngược chuỗi sử dụng Stack:

//    public static void main(String[] args) {
//
//        Stack<String> stringStack = new Stack<>();
//
//        String[] array;
//        Stack<String> strings = new Stack<>();
//        String str = "hello";
//        array = str.split("");
//        System.out.println("mảng sau khi tách các ký tự chuỗi là :"+Arrays.toString(array));
//        for (int i = 0; i <array.length ; i++) {
//            strings.push(array[i]);
//
//        }
//        for (int i = 0; i <strings.size()+i; i++) {
//            stringStack.push(strings.pop());
//
//
//        }
//        System.out.println("chuỗi sau khi đảo ngược là: "+stringStack);
//    }

    //cách 2: Đảo ngược chuỗi sử dụng Stack:
//    public static void main(String[] args) {
//        Stack<String> strings = new Stack<>();
//        Stack<String> stringStack = new Stack<>();
//        strings.push("h");
//        strings.push("d");
//        strings.push("a");
//        strings.push("b");
//        strings.push("c");
//
//        for (int i = 0; i <strings.size()+i; i++) {
//            stringStack.push(strings.pop());
//        }
//        System.out.println("chuỗi sau khi đảo ngược là: "+stringStack);
//    }
}




