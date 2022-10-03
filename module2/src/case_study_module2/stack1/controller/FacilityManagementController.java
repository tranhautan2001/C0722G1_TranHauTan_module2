package case_study_module2.stack1.controller;

import case_study_module2.stack1.service.IFacilityManagementService;
import case_study_module2.stack1.service.impl.FacilityManagementService;

import java.util.Scanner;

public class FacilityManagementController {
    private IFacilityManagementService iFacilityManagementService = new FacilityManagementService();
    private Scanner scanner = new Scanner(System.in);

    public void menuFacilityManagement() {
        do {
            System.out.println("---CHƯƠNG TRÌNH QUẢN LÝ CƠ SỞ---\n" +
                    "1. Display list facility \n" +
                    "2. Add new facility \n" +
                    "3. Edit facility \n" +
                    "4. Return main menu");
            System.out.println("---------------------------");
            System.out.println("---------------------------");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1: {
                    iFacilityManagementService.displaylistfacility();
                    break;
                }
                case 2: {
                    iFacilityManagementService.addnewfacility();
                    break;
                }
                case 3: {
                    iFacilityManagementService.editfacility();
                    break;
                }
                case 4: {
                    return;
                }
            }
        } while (true);
    }
}
