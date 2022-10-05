package case_study_module2.stack1.utils;

import case_study_module2.stack1.model.person.Customer;
import case_study_module2.stack1.model.person.Employee;

import java.io.*;
import java.util.List;

public class WriteFile {
    private static  void writeFile(String path,String data){
        try {
            File file = new File(path);
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(data);
            bufferedWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void writeEmployeeFile(String path, List<Employee> employees){
        StringBuilder data = new StringBuilder();
        for (Employee employee: employees) {
            data.append(employee.getInfo());
        }
        writeFile(path,data.toString());
    }
    public static void writeCustomerFile(String path, List<Customer> customers){
        StringBuilder data = new StringBuilder();
        for (Customer customer: customers) {
            data.append(customer.getInfo());
        }
        writeFile(path,data.toString());
    }

}
