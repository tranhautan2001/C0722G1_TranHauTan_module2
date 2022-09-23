package ss_14_sort_algorithm.exercis.exercsi1;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập kích thước danh sách:");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.println("Nhập " + list.length + " Giá trị:");
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }
        System.out.print("Danh sách đầu vào của bạn : ");
        for (int value : list) {
            System.out.print(value + "\t");
        }
        System.out.println();
        System.out.println("Bắt đầu xử lý sắp xếp ...");
        insertionSortByStep(list);
    }

    public static void insertionSortByStep(int[] list) {
        int pos, x;
        for (int i = 1; i < list.length; i++) {
            x = list[i];
            pos = i;
            while (pos > 0 && x < list[pos - 1]) {
                list[pos] = list[pos - 1];
                pos--;
            }
            list[pos] = x;
            System.out.println("Liệt kê sau  " + x + "' loại: ");
            for (int j = 0; j < list.length; j++) {
                System.out.print(list[j] + "\t");
            }
            System.out.println();
        }

    }

}
