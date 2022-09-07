package ss3_arrays_and_methods_in_Java.practice.reverse_the_elements_of_an_array;

import java.util.Scanner;

public class Reverse_element {
    public static void main(String[] args) {
    int size;
    int [] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("nhập độ dài mảng");
            size = scanner.nextInt();
            if (size>20)
                System.out.println("độ dài không vượt quá 20");
        }while (size >20);
        array = new int[size];
        int i = 0;
        while (i< array.length){
            System.out.print("nhập giá trọ "+(i+1)+": ");
        }   array[i] = scanner.nextInt();
        i++;
        System.out.printf("%-20s%s", "giá trị mảng: ","");
        for (int j = 0; j <array.length; j++) {
            System.out.print(array[j]+"\t");
        }
    }

}
