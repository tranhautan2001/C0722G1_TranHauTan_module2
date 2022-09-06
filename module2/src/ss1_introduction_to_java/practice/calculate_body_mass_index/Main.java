package ss1_introduction_to_java.practice.calculate_body_mass_index;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight, height, bmi;
        System.out.println("Cân nặng của bạn (tính bằng kg):");
        weight = scanner.nextDouble();

        System.out.println("Chiều cao của bạn (tính bằng mét):");
        height = scanner.nextDouble();

        bmi = weight/Math.pow(height,2);
        System.out.printf("%-20.2f%s", bmi,"Interpretation\n");

        if (bmi<18){
            System.out.printf("%-20.2f%s",bmi,"thiếu cân");
        }else if(bmi<25.0){
            System.out.printf("%-20.2f%s",bmi,"bình thường");
        }else if (bmi<30.0){
            System.out.printf("%-20.2f%s",bmi,"thừa cân");
        }else {
            System.out.println("%-20.2f%s,bmi,béo phì");
        }
    }
}
