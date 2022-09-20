package ss_11_dsa_stack_queue.exercis.exercis5;

import java.util.Arrays;
import java.util.Stack;

public class Bracket {
    public static void main(String[] args) {
        Stack<String> stringStack = new Stack<>();
        String[] array;
        String left;
        boolean check = true;
        String str = "s * (s – a) * (s – b) * (s – c)  ";
        array = str.split("");
        System.out.println("Mảng array khi tách các phần tử từ chuỗi là: " + Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals("(")) {
                stringStack.add(array[i]);
            } else if (array[i].equals(")")) {
                if (stringStack.isEmpty()) {
                    check = false;
                    break;
                } else {
                    left = stringStack.pop();
                    if (!left.equals("(") || !array[i].equals(")")) {
                        check = false;
                        break;
                    }
                }
            }
            if (i == array.length - 1) {
                check = stringStack.isEmpty();
            }
        }
        if (check) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}