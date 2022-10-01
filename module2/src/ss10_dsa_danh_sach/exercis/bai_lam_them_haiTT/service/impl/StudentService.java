package ss10_dsa_danh_sach.exercis.bai_lam_them_haiTT.service.impl;

import ss10_dsa_danh_sach.exercis.bai_lam_them_haiTT.Utils.ReadFile;
import ss10_dsa_danh_sach.exercis.bai_lam_them_haiTT.Utils.WriteFile;
import ss10_dsa_danh_sach.exercis.bai_lam_them_haiTT.check_exception.CheckNameException;
import ss10_dsa_danh_sach.exercis.bai_lam_them_haiTT.check_exception.CheckNumberException;
import ss10_dsa_danh_sach.exercis.bai_lam_them_haiTT.check_exception.CheckScoreExeception;
import ss10_dsa_danh_sach.exercis.bai_lam_them_haiTT.model.Student;
import ss10_dsa_danh_sach.exercis.bai_lam_them_haiTT.service.IStudentService;


import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class StudentService implements IStudentService {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Student> studentList = ReadFile.readStudentFile("ss10_dsa_danh_sach\\exercis\\bai_lam_them_haiTT\\data\\student.txt");

    @Override
    public void addStudent() {
        Student student = infoStudent();
        studentList.add(student);
        System.out.println("Thêm mới sinh viên thành công! ");

        WriteFile.writeStudentFile("ss10_dsa_danh_sach\\exercis\\bai_lam_them_haiTT\\data\\student.txt", studentList);
    }

    @Override
    public void removeStudent() {
        System.out.println("Nhập ID sinh viên cần xóa: ");
        int idRemove = Integer.parseInt(scanner.nextLine());
        boolean isFlag = false;

        for (Student student : studentList) {
            if (student.getId() == idRemove) {
                System.out.println("Bạn có chắc muốn xóa sinh viên này? \n " +
                        "1. CÓ \n" +
                        "2. KHÔNG");
                int choiceYesNo = Integer.parseInt(scanner.nextLine());
                if (choiceYesNo == 1) {
                    studentList.remove(student);
                    System.out.println("Xóa thành công! ");

                    WriteFile.writeStudentFile("ss10_dsa_danh_sach\\exercis\\bai_lam_them_haiTT\\data\\student.txt", studentList);

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
                        if (studentList.get(i).getId() == ID) {
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
        boolean needNextPass = true;
        for (int i = 1; i < studentList.size() && needNextPass; i++) {

            needNextPass = false;
            for (int j = 0; j < studentList.size() - i; j++) {
                if (studentList.get(j).getName().compareTo(studentList.get(j + 1).getName()) > 0) {
                    Collections.swap(studentList, j, j + 1);
                    needNextPass = true;
                }
            }
        }
        System.out.println("Danh sách sau sắp xếp: ");
        displayStudent();
    }


    public static Student infoStudent() {
        Scanner scanner = new Scanner(System.in);
        int id;
        do {
            System.out.print("Mời bạn nhập mã học sinh: ");
            try {
                id = Integer.parseInt(scanner.nextLine());
                if (id <= 0) {
                    throw new CheckNumberException("nhập sai định dạng");
                }
                break;
            } catch (CheckNumberException e) {
                System.out.println(e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("không nhập chữ");
            }
        } while (true);


        String name;
        while (true){

            System.out.print("Mời bạn nhập tên học sinh : ");
            name = scanner.nextLine();
            if (name.matches("^([A-Z][a-z]{1,6}\\s)*[A-Z][a-z]{1,6}$")){
                System.out.println("thêm thành công");
                break;
            }else {
                System.out.println("thêm không thành công");
            }
        }
        String dateOfBirth = "";
        do {
            Pattern pattern = Pattern.compile("^(0[1-9]|[12][0-9]|3[01])[- /.](0[1-9]|1[012])[- /.](19|20)\\d\\d$");
            System.out.println("Mời bạn nhập ngày sinh học sinh: ");
            dateOfBirth = scanner.nextLine();
            Matcher matcher = pattern.matcher(dateOfBirth);
            if (matcher.matches()) {
                System.out.println("nhập đúng đinh dạng");
                break;
            } else {
                System.out.println("nhập sai đinh dạng");
            }

        } while (true);

        String sex;
        while (true) {

            System.out.println("Nhập giới tính của sinh viên: ");
            sex = scanner.nextLine();
            if (sex.matches("^(NAM)|(NU)|(EGBT)$")){
                System.out.println("thêm thành công ");
                break;
            }else {
                System.out.println("thêm không thành công ");
            }

        }
        String className = "";
        while (true) {
            Pattern pattern1 = Pattern.compile("^[CAP]\\d{4}[GHIKLM]$");
            System.out.print("Mời bạn nhập tên lớp: ");
            className = scanner.nextLine();
            Matcher matcher1 = pattern1.matcher(className);
            if (matcher1.matches()) {
                System.out.println("nhập đúng định dạng");
                break;
            } else {
                System.out.println("nhập sai định dạng");
            }
        }
        Double point;
        do {
            System.out.print("Mời bạn nhập điểm của học sinh: ");
            try {
                point = Double.parseDouble(scanner.nextLine());
                if (point < 0 || point > 100) {
                    throw new CheckScoreExeception("nhập sai định dạng");

                }
                break;
            } catch (CheckScoreExeception e) {
                System.out.println("nhập lại");
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        } while (true);

        Student student = new Student(id, name, dateOfBirth, sex, className, point);
        return student;
    }
}
