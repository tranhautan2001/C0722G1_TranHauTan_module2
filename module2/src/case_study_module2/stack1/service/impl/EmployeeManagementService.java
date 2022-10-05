package case_study_module2.stack1.service.impl;

import case_study_module2.stack1.exeception.CheckNumberException;
import case_study_module2.stack1.exeception.CheckwageExeception;
import case_study_module2.stack1.model.person.Employee;
import case_study_module2.stack1.service.IEmployeeManagementService;
import case_study_module2.stack1.utils.ReadFile;
import case_study_module2.stack1.utils.WriteFile;

import java.util.List;
import java.util.Scanner;

public class EmployeeManagementService implements IEmployeeManagementService {
    private static Scanner scanner = new Scanner(System.in);
    private static final String PATH = "case_study_module2\\stack1\\data\\Employee.csv";
    private static List<Employee> employeeList = ReadFile.readEmployeeFile(PATH);

    @Override
    public void displayListEmployees() {
        employeeList = ReadFile.readEmployeeFile(PATH);
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }

    @Override
    public void addNewEmployee() {
        employeeList = ReadFile.readEmployeeFile(PATH);
        Employee employee = (Employee) this.infoEmployee();
        employeeList.add(employee);
        System.out.println("thêm mới thành công");
        WriteFile.writeEmployeeFile(PATH,employeeList);



    }

    @Override
    public void editEmployee() {
        employeeList = ReadFile.readEmployeeFile(PATH);
        System.out.println("nhập ID sản phầm cần sửa");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getId() == id) {
                System.out.println("nhập id mới :");
                int ID = Integer.parseInt(scanner.nextLine());
                employeeList.get(i).setId(ID);
                System.out.println("nhập tên mới :");
                String name = scanner.nextLine();
                employeeList.get(i).setName(name);
                System.out.println("nhập ngày sinh mới :");
                String dateofbirth = scanner.nextLine();
                employeeList.get(i).setDateOfBirth(dateofbirth);
                System.out.println("nhập giới tính mới :");
                String sex = scanner.nextLine();
                employeeList.get(i).setSex(sex);
                System.out.println("nhập số cnmd mới :");
                String idCard = scanner.nextLine();
                employeeList.get(i).setIdCard(idCard);
                System.out.println("nhập số điện thoại mới :");
                String phoneNumber = scanner.nextLine();
                employeeList.get(i).setPhoneNumber(phoneNumber);
                System.out.println("nhập email mới :");
                String email = scanner.nextLine();
                employeeList.get(i).setEmail(email);
                System.out.println("nhập trình độ mới :");
                String lever = scanner.nextLine();
                employeeList.get(i).setLevel(lever);
                System.out.println("nhập vị trí mới :");
                String location = scanner.nextLine();
                employeeList.get(i).setLocation(location);
                System.out.println("nhập lương mới :");
                double wage = scanner.nextDouble();
                employeeList.get(i).setWage(wage);
                System.out.println("edit thành công ! ");
            }
        }
        WriteFile.writeEmployeeFile(PATH,employeeList);
    }
    public static Object infoEmployee() {
        Scanner scanner = new Scanner(System.in);

        int id;
        while (true) {
            System.out.println("mời bạn nhập mã nhân viên :");
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
            System.out.println("mời bạn nhập tên nhân viên :");
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
            System.out.println("mời bạn nhập ngày sinh nhân viên :");
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
            System.out.println("mời bạn nhập giới tính nhân viên :");
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
            System.out.println("mời bạn nhập số cnmd :");
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
            System.out.println("nhập email nhân viên :");
            email = scanner.nextLine();
            if (email.matches("^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$")) {
                System.out.println("thêm thành công");
                break;
            } else {
                System.out.println("nhập sai đinh dạng thêm không thành công !");
            }
        }
        String lever;
        while (true) {
            System.out.println("mời bạn chọn trình độ nhân viên : \n" +
                    "1. Trung cấp \n" +
                    "2. Cao đẳng \n" +
                    "3. Đại học \n" +
                    "4. Tự do ");
            int choice = Integer.parseInt(scanner.nextLine());
            boolean flagCheck = false;
            switch (choice) {
                case 1:
                    lever = "Trung cấp";
                    flagCheck = true;
                    break;
                case 2:
                    lever = "Cao đẳng";
                    flagCheck = true;
                    break;
                case 3:
                    lever = "Đại học";
                    flagCheck = true;
                    break;
                case 4:
                    lever = "Tự do";
                    flagCheck = true;
                    break;
                default:
                    lever = null;
                    System.out.println("Nhập lại.");
            }
            if (flagCheck) {
                break;
            }
        }
        System.out.println("mời bạn nhập vị trí nhân viên");
        String location;
        while (true) {
            System.out.println("mời bạn chọn trình độ nhân viên : \n" +
                    "1. Lễ tân \n" +
                    "2. Phục vụ \n" +
                    "3. Chuyên viên \n" +
                    "4. Giám sát \n" +
                    "5. Quản lý \n" +
                    "6. Giám đốc");
            int choice = Integer.parseInt(scanner.nextLine());
            boolean flagCheck = false;
            switch (choice) {
                case 1:
                    location = "Lễ tân";
                    flagCheck = true;
                    break;
                case 2:
                    location = "Phục vụ";
                    flagCheck = true;
                    break;
                case 3:
                    location = "Chuyên viênc";
                    flagCheck = true;
                    break;
                case 4:
                    location = "Giám sát";
                    flagCheck = true;
                    break;
                case 5:
                    location = "Quản lý";
                    flagCheck = true;
                    break;
                case 6:
                    location = "Giám đốc";
                    flagCheck = true;
                    break;
                default:
                    location = null;
                    System.out.println("Nhập lại.");
            }
            if (flagCheck) {
                break;
            }
        }

        Double wage;
        do {
            System.out.print("Mời bạn nhập lương nhân viên : ");
            try {
                wage = Double.parseDouble(scanner.nextLine());
                if (wage < 0) {
                    throw new CheckwageExeception("nhập sai định dạng");

                }
                break;
            } catch (CheckwageExeception e) {
                System.out.println("nhập lại");
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        } while (true);

        Employee employee = new Employee(id, name, dateofbirth, sex, idCard, phoneNumber, email, lever, location, wage);
        return employee;
    }
}
