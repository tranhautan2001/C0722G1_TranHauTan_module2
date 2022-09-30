package ss_17_IO_binary_file_and_serialization.exercis.exercis1.controller;

import ss_17_IO_binary_file_and_serialization.exercis.exercis1.service.ICarService;
import ss_17_IO_binary_file_and_serialization.exercis.exercis1.service.iplm.CarService;

import java.io.IOException;
import java.util.Scanner;

public class CarController {
    private ICarService iCarService = (ICarService) new CarService();
    private Scanner scanner = new Scanner(System.in);
    public  void menuCar() throws IOException, ClassNotFoundException {
        do{
            System.out.println("---CHƯƠNG TRÌNH QUẢN LÝ XE HƠI--- \n" +
                    "1. Thêm mới xe hơi \n" +
                    "2. Hiển thị danh sách xe hơi \n" +
                    "3. Tìm kiếm  xe hơi \n" +
                    "4. Trở về menu chính");
            System.out.println("---------------------------");
            System.out.println("---------------------------");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:{
                    iCarService.addCar();
                    break;
                }
                case 2:{
                    iCarService.displayCar();
                    break;
                }
                case 3:{
                    iCarService.seachCar();
                    break;
                }
                case 4:{
                    return;
                }
            }
        }while (true);
    }
}
