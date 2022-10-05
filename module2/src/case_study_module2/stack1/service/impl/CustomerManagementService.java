package case_study_module2.stack1.service.impl;

import case_study_module2.stack1.exeception.CheckNumberException;
import case_study_module2.stack1.model.person.Customer;
import case_study_module2.stack1.service.ICustomerManagementService;
import case_study_module2.stack1.utils.ReadFile;
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
        System.out.println("thêm mới thành công! ");
        WriteFile.writeCustomerFile(PATH,customerList);
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
        int id;
        while (true) {
            System.out.println("mời bạn nhập mã khách hàng :");
            try {
                id = Integer.parseInt(scanner.nextLine());
                if (id <= 0) {
                    throw new CheckNumberException("nhập sai định dạng");
                }
                break;
            } catch (CheckNumberException e) {
                e.printStackTrace();
            } catch (NumberFormatException e) {
                System.out.println("không nhập chữ");
            }
        }
        String name;
        while (true) {
            System.out.println("mời bạn nhập tên khách hàng :");
            name = scanner.nextLine();
            if (name.matches("^([A-Z][a-z]{1,6}\\s)*[A-Z][a-z]{1,6}$")) {
                System.out.println("thêm thành công");
                break;
            } else {
                System.out.println("thêm không thành công");
            }
        }
        String dateofbirth;
        while (true) {
            System.out.println("mời bạn nhập ngày sinh khách hàng  :");
            dateofbirth = scanner.nextLine();
            if (dateofbirth.matches("^(0[1-9]|[12][0-9]|3[01])[- /.](0[1-9]|1[012])[- /.](19|20)\\d\\d$")) {
                System.out.println("thêm thành công");
                break;
            } else {
                System.out.println("nhập sai định dạng thêm không thành công !");
            }


        }
        String sex;
        while (true) {
            System.out.println("mời bạn nhập giới tính khách hàng  :");
            sex = scanner.nextLine();
            if (sex.matches("^(NAM)|(NU)|(EGBT)$")) {
                System.out.println("thêm thành công !");
                break;
            } else {
                System.out.println("nhập sai đinh dạng thêm không thành công! ");
            }
        }
        String idCard;
        while (true) {
            System.out.println("mời bạn nhập số CMND :");
            idCard = scanner.nextLine();
            if (idCard.matches("^[0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]$")) {
                System.out.println("thêm thành công");
                break;
            } else {
                System.out.println("thêm không thành công vì sai định dạng");
            }
        }
        String phoneNumber;
        while (true) {
            System.out.println("mời bạn nhập số điện thoại");
            phoneNumber = scanner.nextLine();
            if (phoneNumber.matches("^84\\d{9}$")) {
                System.out.println("thêm thành công !");
                break;
            } else {
                System.out.println("thêm không thành công !");
            }
        }
        String email;
        while (true) {
            System.out.println("nhập email khách hàng  :");
            email = scanner.nextLine();
            if (email.matches("^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$")) {
                System.out.println("thêm thành công");
                break;
            } else {
                System.out.println("nhập sai đinh dạng thêm không thành công !");
            }
        }
        String typeOfGuest;
        while (true) {
            System.out.println("mời bạn chọn Loại khách hàng : \n" +
                    "1. Diamond \n" +
                    "2. Platinium \n" +
                    "3. Gold \n" +
                    "3. Silver \n" +
                    "4. Member \n" +
                    "5. Trở về menu");
            int choice = Integer.parseInt(scanner.nextLine());
            boolean flagCheck = false;
            switch (choice) {
                case 1:
                    typeOfGuest = "Diamond";
                    flagCheck = true;
                    break;
                case 2:
                    typeOfGuest = "Platinium";
                    flagCheck = true;
                    break;
                case 3:
                    typeOfGuest = "Gold";
                    flagCheck = true;
                    break;
                case 4:
                    typeOfGuest = "Silver";
                    flagCheck = true;
                    break;
                case 5:
                    typeOfGuest = "Member";
                    flagCheck = true;
                    break;
                default:
                    typeOfGuest = null;
                    System.out.println("Nhập lại.");
            }
            if (flagCheck) {
                break;
            }
        }
        System.out.println("mời bạn nhập địa chỉ khách hàng");
        String address = scanner.nextLine();
        Customer customer = new Customer(id, name, dateofbirth, sex, idCard, phoneNumber, email, typeOfGuest, address);
        return customer;
    }
}
