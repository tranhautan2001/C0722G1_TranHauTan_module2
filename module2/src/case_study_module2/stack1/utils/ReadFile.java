package case_study_module2.stack1.utils;

import case_study_module2.stack1.model.person.Customer;
import case_study_module2.stack1.model.person.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    private static List<String> readFile(String path) {
        List<String> stringList = new ArrayList<>();
        String line;
        try {
            File file = new File(path);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while ((line = bufferedReader.readLine()) != null) {
                stringList.add(line);

            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();

        }
        return stringList;
    }

    public static List<Employee> readEmployeeFile(String path) {
        List<String> stringList = readFile(path);
        List<Employee> employeeList = new ArrayList<>();
        String[] info;
        for (String line : stringList) {
            info = line.split(",");
            if (info.length == 10) {
                employeeList.add(new Employee(Integer.parseInt(info[0]), info[1], info[2], info[3], info[4], info[5], info[6], info[7], info[8], Double.parseDouble(info[9])));
            }
        }
        return employeeList;
    }
    public static List<Customer> readCustomerFile(String path) {
        List<String> stringList = readFile(path);
        List<Customer> customerList = new ArrayList<>();
        String[] info;
        for (String line : stringList) {
            info = line.split(",");
            if (info.length == 9) {
                customerList.add(new Customer(Integer.parseInt(info[0]), info[1], info[2], info[3], info[4], info[5], info[6], info[7], info[8]));
            }
        }
        return customerList;
    }
}
