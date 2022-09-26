package ss_15_exception_handling_end_debug.practice.practice1;

import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        System.out.println("Bộ phân giải phương trình tuyến tính ");
        System.out.println("Cho một phương trình dưới dạng ' a * x + b = 0 ',vui lòng nhập hằng số:" );

        Scanner scanner = new Scanner(System.in);

        System.out.println("a :");
        double a = scanner.nextDouble();

        System.out.println("b :");
        double b = scanner.nextDouble();

        if (a != 0){
            double solution = -b/ a;
            System.out.printf("Giải pháp là : %f!", solution);
        }else {
            if (b == 0){
                System.out.println("Giải pháp tất cả x!");
            }else{
                System.out.println("Không có giải pháp !");
            }
        }
    }
}
