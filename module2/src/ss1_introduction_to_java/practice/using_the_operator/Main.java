package ss1_introduction_to_java.practice.using_the_operator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      float width;
      float height;
      Scanner scanner = new Scanner(System.in);  // khai báo đối tượng Scanner: cho người dùng nhập
        System.out.println("enter width");
        width = scanner.nextFloat(); // nhập chiều rộng

        System.out.println("enter height");
        height = scanner.nextFloat(); // nhập chiều dài

      float area = width * height;

        System.out.println("is area = "+area);
    }
}
