package ss_13_search_algorithm.practice.practice2;

import java.util.Scanner;

public class AlgorithmComplexityTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập chuỗi");
        String inputString = sc.nextLine();

        int[] frequentChar = new int[225];
        for (int i = 0; i <inputString.length(); i++) {
            int ascii = inputString.charAt(i);
            frequentChar[ascii]+=1;
        }
        int max = 0;
        char character = (char) 225;
        for (int j = 0; j <225 ; j++) {
            if (frequentChar[j] > max){
                max = frequentChar[j];
                character = (char) j;
            }
        }
        System.out.println("chữ cái xuất hiện nhiều nhất là: '"+ character+"' với tần suất "+max + " thời gian");
    }

}
