package case_study_module2.stack1.controller;

import case_study_module2.stack1.service.IPromotionManagementService;
import case_study_module2.stack1.service.impl.PromotionManagementService;

import java.util.Scanner;

public class PromotionManagementController {
    private IPromotionManagementService iPromotionManagementService = new PromotionManagementService();
    private Scanner scanner = new Scanner(System.in);
    public void menuPromotionManagement() {
        do {
            System.out.println("---CHƯƠNG TRÌNH DANH SÁCH HIỂN THỊ KHÁCH HÀNG NHẬN ĐƯỢC VOUCHER---\n" +
                    "1. Display list customers use service \n" +
                    "2. Display list customers get voucher \n" +
                    "3. Return main menu");
            System.out.println("---------------------------");
            System.out.println("---------------------------");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:{
                    iPromotionManagementService.displaylistcustomersuseservice();
                    break;
                }
                case 2:{
                    iPromotionManagementService.displaylistcustomersgetvoucher();
                    break;
                }
                case 3:{
                    return;
                }
            }
        }while (true);
    }
}
