package ss_11_dsa_stack_queue.exercis.exercis3;

import java.util.Stack;

public class Decimal {
    public static void main(String[] args) {
        Stack<Integer> integerStack = new Stack<>();
        int n = 111;
        while (n != 0) {
            integerStack.push(n % 2);
            n = n / 2;

        }
        System.out.println("hệ nhị phân là: ");
        while (!(integerStack.isEmpty())) {
            System.out.print(integerStack.pop());
        }

    }
}
