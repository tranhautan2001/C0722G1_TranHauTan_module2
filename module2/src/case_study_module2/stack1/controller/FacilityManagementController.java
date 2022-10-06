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
                    "1. Cơ sở danh sách hiển thị \n" +
                    "2. Thêm cơ sở mới \n" +
                    "3. Chỉnh sửa cơ sở \n" +
                    "4. Trở lại menu chính");
            System.out.println("---------------------------");
            System.out.println("---------------------------");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1: {
                    iFacilityManagementService.displayFacility();
                    break;
                }
                case 2: {
                    while (true){
                        System.out.println("1. Thêm biệt thự mới");
                        System.out.println("2. Thêm nhà mới");
                        System.out.println("3. Thêm phòng mới");
                        System.out.println("4. Trở lại menu chính");
                        int choice1 = Integer.parseInt(scanner.nextLine());
                        switch (choice1){
                            case 1: {
                                iFacilityManagementService.addNewVilla();
                                break;
                            } case 2:{
                                iFacilityManagementService.addNewHouse();
                                break;
                            } case 3:{
                                iFacilityManagementService.addNewRoom();
                                break;
                            } case 4: {
                                return;
                            }
                        }
                    }
                }
                case 3: {
                    iFacilityManagementService.displayFacilityMaintenance();
                    break;
                }
                case 4: {
                    return;
                }
            }
        } while (true);
    }
}
