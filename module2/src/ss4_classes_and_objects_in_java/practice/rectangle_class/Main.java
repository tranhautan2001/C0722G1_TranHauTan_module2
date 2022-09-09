package ss4_classes_and_objects_in_java.practice.rectangle_class;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập chiều dài");
        double width = scanner.nextDouble();
        System.out.println("nhập chiều rộng");
        double height = scanner.nextDouble();
        Rectangle_class rectangle_class = new Rectangle_class(width,height);
        System.out.println("hình chữ nhật của bạn: " + rectangle_class.display());
        System.out.println("chu vi hình chữ nhật: " + rectangle_class.getPerimeter());
        System.out.println("diện tích hình chữ nhật: " +rectangle_class.Area());
    }
}
