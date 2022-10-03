package case_study_module2.stack1.controller;
import case_study_module2.stack1.service.ICustomerManagementService;
import case_study_module2.stack1.service.impl.CustomerManagementService;
import java.util.Scanner;

public class CustomerManagementController {
    private ICustomerManagementService customerManagementService = new CustomerManagementService();
    private Scanner scanner = new Scanner(System.in);
    public void menuCustomerManagement() {
        do {
            System.out.println("---CHƯƠNG TRÌNH QUẢN LÝ KHÁCH HÀNG---\n" +
                    "1. Display list customers \n" +
                    "2. Add new customers \n" +
                    "3. Edit customers \n"  +
                    "4. Return main menu");
            System.out.println("---------------------------");
            System.out.println("---------------------------");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:{
                    customerManagementService.displaylistcustomers();
                    break;
                }
                case 2:{
                    customerManagementService.addnewcustomers();
                    break;
                }
                case 3:{
                    customerManagementService.editcustomers();
                    break;
                }
                case 4:{
                    return;
                }
            }
        }while (true);
    }
}
