package case_study_module2.stack1.controller;

import case_study_module2.stack1.service.IBookingManagementService;
import case_study_module2.stack1.service.impl.BookingManagementService;

import java.util.Scanner;

public class BookingManagementController {
    private IBookingManagementService iBookingManagementService = new BookingManagementService();
    private Scanner scanner = new Scanner(System.in);
    public void menuBookingManagement() {
        do {
            System.out.println("---CHƯƠNG TRÌNH QUẢN LÝ ĐẶT PHÒNG---\n" +
                    "1. Add new booking \n" +
                    "2. Display list booking \n" +
                    "3. Create new constracts \n"  +
                    "4. Display list contracts \n"  +
                    "5. Edit contracts \n"  +
                    "6. Return main menu ");
            System.out.println("---------------------------");
            System.out.println("---------------------------");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:{
                    iBookingManagementService.addnewbooking();
                    break;
                }
                case 2:{
                    iBookingManagementService.displaylistbooking();
                    break;
                }
                case 3:{
                    iBookingManagementService.createnewconstracts();
                    break;
                }
                case 4:{
                    iBookingManagementService.displaylistcontracts();
                    break;
                }
                case 5:{
                    iBookingManagementService.editcontracts();
                    break;
                }
                case 6:{
                    return;
                }
            }
        }while (true);
    }
}
