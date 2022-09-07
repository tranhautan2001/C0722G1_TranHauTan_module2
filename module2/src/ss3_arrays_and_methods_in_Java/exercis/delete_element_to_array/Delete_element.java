package ss3_arrays_and_methods_in_Java.exercis.delete_element_to_array;

import java.util.Arrays;
import java.util.Scanner;

public class Delete_element {
    public static void main(String[] args) {
     int[]array = {10,4,6,7,8,6,0,0,0,0};
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số phần tử cần xóa");
        int N = Integer.parseInt(scanner.nextLine());
        for (int i = 0,j=0; i <array.length;j++, i++) {
            if (N == array[i]){
                array[j] = array[i+1];
                i++;
            }
            else {
                array[j] = array[i];
            }

        }
        System.out.println(Arrays.toString(array));
        }
    }
