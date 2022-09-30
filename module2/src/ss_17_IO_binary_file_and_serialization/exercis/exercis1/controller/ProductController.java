package ss_17_IO_binary_file_and_serialization.exercis.exercis1.controller;

import java.io.IOException;
import java.util.Scanner;

public class ProductController {
    public static void displayMainMenu() throws IOException, ClassNotFoundException {
      CarController  carController = new CarController();
        Scanner scanner = new Scanner(System.in);

      do {
          System.out.println("--------------------");
          System.out.println("---CHƯƠNG TRÌNH QUẢN LÝ SẢN PHẨM--- \n" +
                  "1. Quản lý Xe Hơi \n" +
                  "3. Exit");

          int choice = 0;
          try {
              System.out.println("Mời bạn nhập lựa chọn để tiếp tục :");
              choice = Integer.parseInt(scanner.nextLine());
          }catch (NumberFormatException e){
              System.out.println("vui lòng nhập số ! ");
          }
          switch (choice){
              case 1:{
                  carController.menuCar();
                  break;
              }
              case 2:{
                  System.exit(1);
              }
          }
          break;
      }while (true);
    }
}
