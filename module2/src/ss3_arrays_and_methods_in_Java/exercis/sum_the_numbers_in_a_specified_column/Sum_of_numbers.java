package ss3_arrays_and_methods_in_Java.exercis.sum_the_numbers_in_a_specified_column;

import java.util.Scanner;

public class Sum_of_numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập chiều dài mảng: ");
        int rowOne = Integer.parseInt(scanner.nextLine());
        System.out.print("nhập chiều dài cột ");
        int columnOne = Integer.parseInt(scanner.nextLine());
        int[][] array = new int[rowOne][columnOne];
        System.out.println("nhập phần tử mảng");
        for (int i = 0; i < rowOne; i++) {
            for (int j = 0; j < columnOne; j++) {
                array[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        int sum = 0;
        System.out.println("nhập số cột cần tính tổng: ");
        int columnTwo = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < array.length; i++) {
            sum += array[i][columnTwo];
        }
        System.out.println("tổng của cột là: "+sum);
    }


}

