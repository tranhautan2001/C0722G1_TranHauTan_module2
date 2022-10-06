package case_study_module2.stack1.controller;

import java.util.Scanner;

public class FuramaController {
    public static void displayMainMenu() {
        EmployeeManagementController employeeManagementController = new EmployeeManagementController();
        CustomerManagementController customerManagementController = new CustomerManagementController();
        BookingManagementController bookingManagementController = new BookingManagementController();
        FacilityManagementController facilityManagementController = new FacilityManagementController();
        PromotionManagementController promotionManagementController = new PromotionManagementController();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("--------------------");
            System.out.println("---CHƯƠNG TRÌNH QUẢN LÝ FURAMA---\n" +
                    "1. Quản lý nhân sự \n" +
                    "2. Quản lý khách hàng \n" +
                    "3. Quản lý cơ sở \n" +
                    "4. Quản lý đặt chỗ \n" +
                    "5. Quản lý Quảng cáo \n" +
                    "6. Thoát");

            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1: {
                    employeeManagementController.menuEmployeeManagement();
                    break;
                }
                case 2: {
                    customerManagementController.menuCustomerManagement();
                    break;
                }
                case 3: {
                    facilityManagementController.menuFacilityManagement();
                    break;
                }
                case 4: {
                    bookingManagementController.menuBookingManagement();
                    break;
                }
                case 5: {
                    promotionManagementController.menuPromotionManagement();
                    break;
                }
                case 6: {
                    System.exit(1);
                }
            }
        }
    }
}
