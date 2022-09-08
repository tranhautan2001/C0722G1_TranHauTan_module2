package ss3_arrays_and_methods_in_Java.exercis.sum_the_numbers_on_the_diagonal;

import java.util.Scanner;

public class Sum_the_numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập chiều dài mảng: ");
        int rowTow = Integer.parseInt(scanner.nextLine());
        System.out.print("nhập chiều dài cột ");
        int columnTow = Integer.parseInt(scanner.nextLine());
        int[][] array = new int[rowTow][columnTow];
        System.out.println("nhập phần tử mảng");
        for (int i = 0; i < rowTow; i++) {
            for (int j = 0; j < columnTow; j++) {
                System.out.print("nhập số phần tử thứ " + j + " : ");
                array[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i][i];
        }
        System.out.println("tổng đường chéo 1: " + sum);
        int sum1 = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            sum1 += array[i][i];
        }
        System.out.println("tổng đường chéo 2: " + sum1);
    }
}
