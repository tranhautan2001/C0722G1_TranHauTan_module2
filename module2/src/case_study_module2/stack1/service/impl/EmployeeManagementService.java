package case_study_module2.stack1.service.impl;

import case_study_module2.stack1.exeception.CheckNumberException;
import case_study_module2.stack1.exeception.CheckwageExeception;
import case_study_module2.stack1.model.person.Employee;
import case_study_module2.stack1.service.IEmployeeManagementService;
import case_study_module2.stack1.utils.ReadFile;
import case_study_module2.stack1.utils.ValidateEmployee;
import case_study_module2.stack1.utils.WriteFile;

import java.util.List;
import java.util.Scanner;

public class EmployeeManagementService implements IEmployeeManagementService {
    private static final Scanner scanner = new Scanner(System.in);
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
        Employee employee = infoEmployee();
        employeeList.add(employee);
        WriteFile.writeEmployeeFile(PATH,employeeList);
        System.out.println("thêm mới thành công");



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
    public static Employee infoEmployee() {
        int id = ValidateEmployee.getId();
        String name = ValidateEmployee.getName();
        String dateofbirth = ValidateEmployee.getDateOfBirth();
        String sex = ValidateEmployee.getSex();
        String idCard = ValidateEmployee.getIdCard();
        String phoneNumber = ValidateEmployee.getPhoneNumber();
        String email = ValidateEmployee.getEmail();
        String lever = ValidateEmployee.getLever();
        String location = ValidateEmployee.getLocation();
        double wage = ValidateEmployee.getWage();


        Employee employee = new Employee(id, name, dateofbirth, sex, idCard, phoneNumber, email, lever, location, wage);
        return employee;
    }
}
