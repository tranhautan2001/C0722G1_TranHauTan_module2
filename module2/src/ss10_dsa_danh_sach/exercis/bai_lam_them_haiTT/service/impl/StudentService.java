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


public class StudentService implements IStudentService {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Student> studentList = ReadFile.readStudentFile("ss10_dsa_danh_sach\\exercis\\bai_lam_them_haiTT\\data\\student.txt");


    @Override
    public void addStudent() {
        Student student = infoStudent();
        studentList.add(student);
        System.out.println("Thêm mới sinh viên thành công! ");

        WriteFile.writeStudentFile("ss10_dsa_danh_sach\\exercis\\bai_lam_them_haiTT\\data\\student.txt",studentList);
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

                    WriteFile.writeStudentFile("ss10_dsa_danh_sach\\exercis\\bai_lam_them_haiTT\\data\\student.txt",studentList);

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


        String name ;
        while (true){
            try {
                System.out.print("Mời bạn nhập tên học sinh: ");
                name = scanner.nextLine();
                for (int i = 0; i <name.length() ; i++) {
                    if(Character.isDigit(name.charAt(i))) {
                        throw new CheckNameException("Tên không được chứa số");
                    }
                }
                break;
            } catch (CheckNameException e) {
                System.out.println(e.getMessage());

            }
        }
        int dateOfBirth;
        do {
            System.out.println("Mời bạn nhập ngày sinh học sinh: ");
            try {
                dateOfBirth = Integer.parseInt(scanner.nextLine());
                if (dateOfBirth<=0){
                    throw new CheckNumberException("nhập sai định dạng");
                }
                break;
            }catch (CheckNumberException e){
                System.out.println("nhập lại");
            }catch (NumberFormatException e){
                System.out.println(e.getMessage());
            }

        }while (true);

        System.out.print("Mời bạn nhập giới tính học sinh: ");
        String sex = scanner.nextLine();
        System.out.print("Mời bạn nhập tên lớp: ");
        String className = scanner.nextLine();
        Double point;
        do {
            System.out.print("Mời bạn nhập điểm của học sinh: ");
            try {
                point = Double.parseDouble(scanner.nextLine());
                if (point<0 || point>100){
                    throw new CheckScoreExeception("nhập sai định dạng");

                }
                break;
            }catch (CheckScoreExeception e){
                System.out.println("nhập lại");
            }catch (NumberFormatException e){
                System.out.println(e.getMessage());
            }
        }while (true);

        Student student = new Student(id, name, dateOfBirth, sex, className, point);
        return student;
    }

}
