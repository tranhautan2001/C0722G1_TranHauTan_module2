package case_study_module2.stack1.service.impl;

import case_study_module2.stack1.exeception.CheckNumberException;
import case_study_module2.stack1.model.person.Customer;
import case_study_module2.stack1.service.ICustomerManagementService;
import case_study_module2.stack1.utils.ReadFile;
import case_study_module2.stack1.utils.ValidateCustomer;
import case_study_module2.stack1.utils.WriteFile;
import java.util.List;
import java.util.Scanner;


public class CustomerManagementService implements ICustomerManagementService {
    private static Scanner scanner = new Scanner(System.in);
    private static final String PATH = "case_study_module2\\stack1\\data\\Customer.csv";
    private static List<Customer> customerList = ReadFile.readCustomerFile(PATH);

    @Override
    public void displaylistcustomers() {
        customerList = ReadFile.readCustomerFile(PATH);
        for (Customer customer : customerList) {
            System.out.println(customer);
        }
    }

    @Override
    public void addnewcustomers() {
       customerList = ReadFile.readCustomerFile(PATH);
        Customer customer = this.infoCumtomer();
        customerList.add(customer);
        WriteFile.writeCustomerFile(PATH,customerList);
        System.out.println("thêm mới thành công! ");
    }


    @Override
    public void editcustomers() {
        customerList = ReadFile.readCustomerFile(PATH);
        System.out.println("nhập ID sản phầm cần sửa");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getId() == id) {

                System.out.println("nhập id mới :");
                int ID = Integer.parseInt(scanner.nextLine());
                customerList.get(i).setId(ID);
                System.out.println("nhập tên mới :");
                String name = scanner.nextLine();
                customerList.get(i).setName(name);
                System.out.println("nhập ngày sinh mới :");
                String dateofbirth = scanner.nextLine();
                customerList.get(i).setDateOfBirth(dateofbirth);
                System.out.println("nhập giới tính mới :");
                String sex = scanner.nextLine();
                customerList.get(i).setSex(sex);
                System.out.println("nhập số cnmd mới :");
                String idCard = scanner.nextLine();
                customerList.get(i).setIdCard(idCard);
                System.out.println("nhập số điện thoại mới :");
                String phoneNumber = scanner.nextLine();
                customerList.get(i).setPhoneNumber(phoneNumber);
                System.out.println("nhập email mới :");
                String email = scanner.nextLine();
                customerList.get(i).setEmail(email);
                System.out.println("nhập trình độ mới :");
                String typeOfGuest = scanner.nextLine();
                customerList.get(i).setTypeOfGuest(typeOfGuest);
                System.out.println("nhập vị trí mới :");
                String address = scanner.nextLine();
                customerList.get(i).setAddress(address);
                System.out.println("nhập lương mới :");
                System.out.println("edit thành công ! ");
            }

        }
        WriteFile.writeCustomerFile(PATH,customerList);
    }

    private static Customer infoCumtomer() {
       int id = ValidateCustomer.getID();
       String name = ValidateCustomer.getName();
       String dateofbirth = ValidateCustomer.getDateOfBirth();
       String sex = ValidateCustomer.getSex();
       String idCard = ValidateCustomer.getIdCard();
       String phoneNumber = ValidateCustomer.getPhoneNumber();
       String email = ValidateCustomer.getEmail();
       String typeOfGuest = ValidateCustomer.getTypeOfGuest();
        System.out.println("mời bạn nhập địa chỉ khách hàng");
        String address = scanner.nextLine();
        Customer customer = new Customer(id, name, dateofbirth, sex, idCard, phoneNumber, email, typeOfGuest, address);
        return customer;
    }
}
