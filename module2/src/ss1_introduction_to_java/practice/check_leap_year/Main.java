package ss1_introduction_to_java.practice.check_leap_year;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        System.out.println("nhập năm: ");
        year = scanner.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.printf("%d là năm nhuận", year);
                } else {
                    System.out.printf("%d không phải là năm nhuận", year);
                }
            } else {
                System.out.printf("%d là năm nhuận", year);
            }
        } else {
            System.out.printf("%d không phải là năm nhuận", year);
        }
    }
}
//        boolean isLeapYear = false;
//
//        if(year % 4 == 0){
//            if(year % 100 == 0){
//                if(year % 400 == 0){
//                    isLeapYear = true;
//                }
//            } else {
//                isLeapYear = true;
//            }
//        }
//
//        if(isLeapYear){
//            System.out.printf("%d là năm nhuận", year);
//        } else {
//            System.out.printf("%d không phải là năm nhuận", year);
//        }

