package ss1_introduction_to_java.practice.solving_first_degree_equations;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bộ phân giải phương trình tuyến tính");
        System.out.println("Cho một phương trình là 'a * x + b = c', vui lòng nhập các hằng số:");
        Scanner scanner = new Scanner(System.in);
        System.out.print("a :");
        double a = scanner.nextDouble();

        System.out.print("b :");
        double b = scanner.nextDouble();

        System.out.print("c :");
        double c = scanner.nextDouble();
        if (a != 0) {
            double answer = (c - b) / a;
            System.out.printf("Phương trình truyền với x = %f\n", answer);
        } else {
            if (b == c) {
                System.out.println("Lời giải là tất cả x!");
            } else {
                System.out.println("Không có giải pháp!");
            }
        }


    }

}

