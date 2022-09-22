package ss_13_search_algorithm.exercis.exercis2;

import java.util.Arrays;
import java.util.Scanner;

public class RecursiveAlgorithm {
    public static void main(String[] args) {
        int n, tempSort;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("nhập vào số phần tử của mảng");
            n = Integer.parseInt(scanner.nextLine());
        } while (n < 0);
        int array[] = new int[n];
        System.out.println("nhập các phần tử cho mảng");
        for (int i = 0; i < n; i++) {
            System.out.print("nhập phần tử thứ " + i + ":");
            array[i] = Integer.parseInt(scanner.nextLine());
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j <= n - 1; j++) {
                if (array[i] > array[j]) {
                    tempSort = array[i];
                    array[i] = array[j];
                    array[j] = tempSort;
                }
            }

        }
        System.out.println("mảng được sắp xếp theo thứ tự tăng dần là: " +Arrays.toString(array));
        System.out.print("Nhập số muốn tìm: ");
        int number = Integer.parseInt(scanner.nextLine());
        int index = binarySearch(array,0, array.length-1,number);
        System.out.println(index);
    }

    static int binarySearch(int[] array, int left, int right, int value) {
        if (right >= left) {
            int midder = (left + right) / 2;

            if (array[midder] == value) {
                return midder;
            }
            if (value > array[midder]) {
                return binarySearch(array, midder + 1, right, value);
            }
            return binarySearch(array, left, midder - 1, value);
        }
        return -1;
    }

}