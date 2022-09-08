package ss3_arrays_and_methods_in_Java.exercis.find_the_smallest_value;

import java.util.Scanner;

public class Find_the_smallest_value {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập độ dài mảng: ");
        int length = Integer.parseInt(scanner.nextLine());
        int[] array = new int[length];
        System.out.println("nhập các phần tử của mảng: ");
        for (int i = 0; i < length; i++) {
            System.out.print("nhập phần tử thứ "+i + " : ");
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min)
                min = array[i];
        }
        System.out.println("giá trị nhỏ nhất trong mảng là: " + min);
    }
}
