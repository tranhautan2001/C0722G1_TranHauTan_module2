package ss3_arrays_and_methods_in_Java.exercis.merge_array;

import java.util.Arrays;

public class Merga_array {
    public static void main(String[] args) {
     int[]arrayOne = {1,2,3,4};
     int[]arrayTwo = {5,6,7,8};
     int[] targetArray = new int[arrayOne.length+arrayTwo.length];
        {
            int i = 0;
            while (i <arrayOne.length) {
                targetArray[i] = arrayOne[i];
                i++;
            }
        }
        int i = 0;
        while (i <arrayTwo.length) {
            targetArray[i+4] = arrayTwo[i];
            i++;
        }
        System.out.println("mảng thứ 3 sau khi gộp là: "+"\n"+Arrays.toString(targetArray));
    }
}
