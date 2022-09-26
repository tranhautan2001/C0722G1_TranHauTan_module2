package ss_15_exception_handling_end_debug.exercis;

import java.util.Scanner;

public class Triangle extends IllegalTriangleException {
    public Triangle(String message) {
        super(message);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a;
        do {
            System.out.println("nhập cạnh a");
            try {
                a = Double.parseDouble(scanner.nextLine());
                if (a < 0) {
                    throw new IllegalTriangleException("nhập sai định dạng");
                }
                break;
            } catch (IllegalTriangleException | NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        } while (true);
        double b;
        do {
            System.out.println("nhập cạnh b");
            try {
                b = Double.parseDouble(scanner.nextLine());
                if (b < 0) {
                    throw new IllegalTriangleException("nhập sai định dạng");
                }
                break;
            } catch (IllegalTriangleException | NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        } while (true);
        double c;
        do {
            System.out.println("nhập cạnh c");
            try {
                c = Double.parseDouble(scanner.nextLine());
                if (c < 0) {
                    throw new IllegalTriangleException("nhập sai định dạng");
                }
                break;
            } catch (IllegalTriangleException | NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        } while (true);
        try {
            if (a + b < c || b + c < a || c + a < b) {
                throw new IllegalTriangleException("Lỗi khi tổng 2 cạnh của tam giác nhỏ hơn cạnh còn lại");
            }
        } catch (IllegalTriangleException e) {
            System.out.println(e.getMessage());
        }
    }
}
