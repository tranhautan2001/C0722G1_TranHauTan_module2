package case_study_module2.stack1.controller;

import case_study_module2.stack1.service.IEmployeeManagementService;
import case_study_module2.stack1.service.impl.EmployeeManagementService;

import java.util.Scanner;

public class EmployeeManagementController {
  private IEmployeeManagementService iEmployeeManagementService = new EmployeeManagementService();
  private Scanner scanner = new Scanner(System.in);

    public void menuEmployeeManagement() {
        do {
            System.out.println("---CHƯƠNG TRÌNH QUẢN LÝ NHÂN VIÊN---\n" +
                    "1. Hiển Thị Danh Sách Nhân Viên \n" +
                    "2. Thêm nhân viên mới \n" +
                    "3. Chỉnh sửa nhân viên \n"  +
                    "4. Trở lại menu chính");
            System.out.println("---------------------------");
            System.out.println("---------------------------");
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice){
                    case 1:{
                        iEmployeeManagementService.displayListEmployees();
                        break;
                    }
                    case 2:{
                        iEmployeeManagementService.addNewEmployee();
                        break;
                    }
                    case 3:{
                        iEmployeeManagementService.editEmployee();
                        break;
                    }
                    case 4:{
                     return;
                    }
                }
        }while (true);
    }
}
