package ss10_dsa_danh_sach.exercis.bai_lam_them_haiTT.service.impl;

import ss10_dsa_danh_sach.exercis.bai_lam_them_haiTT.model.Student;
import ss10_dsa_danh_sach.exercis.bai_lam_them_haiTT.model.Teacher;
import ss10_dsa_danh_sach.exercis.bai_lam_them_haiTT.service.IStudentService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class StudentService implements IStudentService {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Student> studentList = new ArrayList<>();


    @Override
    public void addStudent() {
        Student student = infoStudent();
        studentList.add(student);
        System.out.println("Thêm mới sinh viên thành công! ");

    }

    @Override
    public void removeStudent() {
        System.out.println("Nhập ID sinh viên cần xóa: ");
        int idRemove = Integer.parseInt(scanner.nextLine());
        boolean isFlag = false;

        for (Student student : studentList) {
            if (student.getInteger() == idRemove) {
                System.out.println("Bạn có chắc muốn xóa sinh viên này? \n " +
                        "1. CÓ \n" +
                        "2. KHÔNG");
                int choiceYesNo = Integer.parseInt(scanner.nextLine());
                if (choiceYesNo == 1) {
                    studentList.remove(student);
                    System.out.println("Xóa thành công! ");

                }
                isFlag = true;
                break;
            }
        }
        if (!isFlag) {
            System.out.println("Không tìm thấy sinh viên này! ");
        }
    }

    @Override
    public void displayStudent() {
        for (Student student : studentList) {
            System.out.println(student);
        }
    }

    @Override
    public void seachStudent() {
        do {
            System.out.println("Nhập 1 để tìm kiếm giảng viên theo name: \n" +
                    "Nhập 2 để tìm kiếm giảng viên theo ID: \n" +
                    "Nhập 3 để thoát");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    String name = scanner.nextLine();
                    for (int i = 0; i < studentList.size(); i++) {
                        if (studentList.get(i).getName().equals(name)) {
                            System.out.println(studentList.get(i));
                            System.out.println("-----------------");
                        }

                    }
                    break;
                case 2:
                    int ID = Integer.parseInt(scanner.nextLine());
                    for (int i = 0; i < studentList.size(); i++) {
                        if (studentList.get(i).getInteger() == ID) {
                            System.out.println(studentList.get(i));
                            System.out.println("-----------------");
                            break;
                        }

                    }
                    break;
                case 3:
                    return;
            }
        } while (true);


    }

    @Override
    public void sortStudent() {
        boolean isSwap = true;
        Student student;
        for (int i = 0; i < studentList.size() - 1 && isSwap; i++) {
            isSwap = false;
            for (int j = 0; j < studentList.size() - 1 - i; j++) {
                int compareName = studentList.get(j).getName().compareTo(studentList.get(j + 1).getName());
                if ( compareName> 0) {
                    isSwap = true;
                    student = studentList.get(j + 1);
                    studentList.set(j + 1, studentList.get(j));
                    studentList.set(j, student);
                }
                if (compareName==0){
                    int compareId= studentList.get(j).getInteger().compareTo(studentList.get(j + 1).getInteger());
                    if (compareId>0){
                        isSwap = true;
                        student = studentList.get(j + 1);
                        studentList.set(j + 1, studentList.get(j));
                        studentList.set(j, student);
                    }
                }
            }
        }
        displayStudent();
    }




    public static Student infoStudent() {
        System.out.print("Mời bạn nhập mã học sinh: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Mời bạn nhập tên học sinh: ");
        String name = scanner.nextLine();
        System.out.println("Mời bạn nhập ngày sinh học sinh: ");
        String dateOfBirth = scanner.nextLine();
        System.out.print("Mời bạn nhập giới tính học sinh: ");
        String sex = scanner.nextLine();
        System.out.print("Mời bạn nhập tên lớp: ");
        String className = scanner.nextLine();
        System.out.print("Mời bạn nhập điểm của học sinh: ");
        double point = Double.parseDouble(scanner.nextLine());
        Student student = new Student(id, name, dateOfBirth, sex, className, point);
        return student;
    }
}
