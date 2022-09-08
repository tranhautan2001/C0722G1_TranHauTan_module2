package ss3_arrays_and_methods_in_Java.exercis.count_the_number_of_occurrences;

import java.util.Scanner;

public class Count_the_number_of_occurrences {
    public static void main(String[] args) {
        String str = "aaabbbccd";
        String[] array = str.split("");
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập ký tự cần kiểm tra: ");
        char c = scanner.nextLine().charAt(0);
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (c == array[i].charAt(0)) {
                count++;
            }
        }
        System.out.println("số lần xuất hiện của ký tự: " + count + " lần ");
    }

}
