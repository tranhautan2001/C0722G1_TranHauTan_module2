package ss3_arrays_and_methods_in_Java.exercis.find_the_largest_element;

import java.util.Arrays;
import java.util.Scanner;

public class Find_the_largest_element {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập sô hàng: ");
        int row = Integer.parseInt(scanner.nextLine());
        System.out.print("nhập số cột: ");
        int column = Integer.parseInt(scanner.nextLine());
        int[][] array = new int[row][column];
        System.out.println("nhập phần tử mảng");
        for (int i = 0; i <row; i++) {
            for (int j = 0; j <column ; j++) {
                array[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        int max = array[0][0];
        for (int i = 0; i <array.length; i++) {
            for (int j = 0; j <array.length; j++) {
                if (array[i][j]> array[0][0]){
                    max = array[i][j];
                }
            }
            System.out.println("phần tử lớn nhất trong mảng :"+max);
        }
    }
}
