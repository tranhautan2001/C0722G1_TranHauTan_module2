package ss1_introduction_to_java.exercis.Currency_converter_app;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double USD;
        double VND = 23000;
        System.out.println("Nhập số tiền : ");
        USD = scanner.nextDouble();
        System.out.println();
        double quyDoi = USD*VND;
        System.out.println("Giá trị VND: "+quyDoi);


    }
}
