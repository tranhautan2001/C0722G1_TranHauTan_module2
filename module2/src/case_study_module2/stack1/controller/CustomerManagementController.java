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
                    "1. Hiển thị danh sách khách hàng \n" +
                    "2. Thêm khách hàng mới \n" +
                    "3. Chỉnh sửa khách hàng \n"  +
                    "4. Trở lại menu chính");
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
