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
                    "1. Employee Management \n" +
                    "2. Customer Management \n" +
                    "3. Facility Management \n" +
                    "4. Booking Management \n" +
                    "5. Promotion Management \n" +
                    "6. Exit");

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
