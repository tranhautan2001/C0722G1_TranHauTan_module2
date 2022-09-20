package teest;

import java.util.ArrayDeque;
import java.util.Deque;

public class Các_hàm_Deque {
    public static void main(String[] args) {
        Deque<String> stringDeque = new ArrayDeque<>();
        stringDeque.add("1");
        stringDeque.add("2");
        stringDeque.add("3");
        stringDeque.add("5");

        System.out.println(stringDeque);

        String firstElement = stringDeque.peekFirst();
        System.out.println(firstElement);

    }
}
