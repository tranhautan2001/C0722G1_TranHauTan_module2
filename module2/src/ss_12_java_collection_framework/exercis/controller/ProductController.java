package ss_12_java_collection_framework.exercis.controller;

import ss_12_java_collection_framework.exercis.service.impl.ProductService;

import java.util.Scanner;

public class ProductController {
    public static void displayMainMenu(){
      ProductService iProductService = new ProductService();
        Scanner scanner = new Scanner(System.in);
        ProductService.test();
        do{
            System.out.println("---CHƯƠNG TRÌNH QUẢN LÝ SẢN PHẨM--- \n" +
                    "1. Thêm mới sản phẩm \n" +
                    "2. Sửa thông tin sản phẩm theo id \n" +
                    "3. Xoá sản phẩm theo id \n" +
                    "4. Hiển thị danh sách sản phẩm \n" +
                    "5. Tìm kiếm sản phẩm theo tên \n" +
                    "6. Sắp xếp sản phẩm tăng dần, giảm dần theo giá \n" +
                    "7. Trở về menu chính" );
            System.out.println("----------------------------------");
            System.out.println("----------------------------------");
            System.out.println("----------------------------------");

            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice){
                case 1:{
                    iProductService.addProduct();
                    break;
                }case 2:{
                    iProductService.editProduct();
                    break;
                }
                case 3:{
                    iProductService.removeProduct();
                    break;
                }
                case 4:{
                    iProductService.displayProduct();
                    break;
                }
                case 5: {
                    iProductService.seachProduct();
                    break;
                }case 6: {
                    iProductService.reverseProduct();
                    break;
                } case 7:{
                    return;
                }
            }
        }while (true);
    }
}
