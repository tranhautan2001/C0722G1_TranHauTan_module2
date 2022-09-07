package ss3_arrays_and_methods_in_Java.exercis.add_element_to_array;

import java.util.Arrays;
import java.util.Scanner;

public class Add_element {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       int[] array = {1,2,3,4,5,6,7,8,9};
        System.out.println("số muốn thêm là: ");
        int numberAdd = scanner.nextInt();
        System.out.println("vị trí muốn thêm: ");
        int indexAdd = scanner.nextInt();
        for (int i = array.length-1 ; i > indexAdd ; i--) {
            array[i] = array[i-1];

        }
        array[indexAdd] = numberAdd;
        System.out.println("mảng sau khi đươc thêm phần tử 5: "+Arrays.toString(array));



    }
}
