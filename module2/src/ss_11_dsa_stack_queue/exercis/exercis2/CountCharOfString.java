package ss_11_dsa_stack_queue.exercis.exercis2;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class CountCharOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập 1 chuỗi: ");

        String string = sc.nextLine();

        String[] arrayString = string.trim().toLowerCase().split(" ");

        Map<String, Integer> map = new TreeMap<>();
        for (String key : arrayString) {
            if (map.containsKey(key)) {
                map.replace(key, map.get(key) + 1);
            } else {
                map.put(key, 1);
            }
        }
        System.out.println(map);

        Set<String> stringSet = map.keySet();
        System.out.println("\nDanh sách từ :");
        for (String key : stringSet) {
            System.out.printf("\nTừ '%s' xuất hiện: %d lần", key, map.get(key));
        }
    }
}
