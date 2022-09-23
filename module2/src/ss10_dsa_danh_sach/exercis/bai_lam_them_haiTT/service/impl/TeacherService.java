package ss10_dsa_danh_sach.exercis.bai_lam_them_haiTT.service.impl;

import ss10_dsa_danh_sach.exercis.bai_lam_them_haiTT.model.Teacher;
import ss10_dsa_danh_sach.exercis.bai_lam_them_haiTT.service.ITeacherService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TeacherService implements ITeacherService {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Teacher> teacherList = new ArrayList<>();


    @Override
    public void addTeacher() {
        Teacher teacher = infoTeacher();
        teacherList.add(teacher);
        System.out.println("Thêm mới giảng viên thành công!");

    }

    @Override
    public void removeTeacher() {
        System.out.println("Nhập ID giảng viên cần xóa: ");
        int idRemove = Integer.parseInt(scanner.nextLine());
        boolean isFlag = false;

        for (Teacher teacher : teacherList) {
            if (teacher.getInteger() == idRemove) {
                System.out.println("Bạn có chắc muốn xóa giảng viên này? " +
                        "1. CÓ \n" +
                        "2. KHÔNG");
                int choiceYesNo = Integer.parseInt(scanner.nextLine());
                if (choiceYesNo == 1) {
                    teacherList.remove(teacher);
                    System.out.println("Xóa thành công! ");
                }
                isFlag = true;
                break;
            }
        }
        if (!isFlag) {
            System.out.println("Không tìm thấy giảng viên này! ");
        }
    }

    @Override
    public void displayTeacher() {
        for (Teacher teacher : teacherList) {
            System.out.println(teacher);
        }
    }

    @Override
    public void seachTeacher() {
        do {
            System.out.println("Nhập 1 để tìm kiếm giảng viên theo name: \n" +
                    "Nhập 2 để tìm kiếm giảng viên theo ID: \n" +
                    "Nhập 3 để thoát");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    String name = scanner.nextLine();
                    for (int i = 0; i < teacherList.size(); i++) {
                        if (teacherList.get(i).getName().contains(name)) {
                            System.out.println(teacherList.get(i));

                        }

                    }
                    break;
                case 2:
                    int ID = Integer.parseInt(scanner.nextLine());
                    for (int i = 0; i < teacherList.size(); i++) {
                        if (teacherList.get(i).getInteger() == ID) {
                            System.out.println(teacherList.get(i));
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
    public void sortTeacher() {
        boolean isSwap = true;
        Teacher teacher;
        for (int i = 0; i < teacherList.size() - 1 && isSwap; i++) {
            isSwap = false;
            for (int j = 0; j < teacherList.size() - 1 - i; j++) {
                int compareName = teacherList.get(j).getName().compareTo(teacherList.get(j + 1).getName());
                if ( compareName> 0) {
                    isSwap = true;
                    teacher = teacherList.get(j + 1);
                    teacherList.set(j + 1, teacherList.get(j));
                    teacherList.set(j, teacher);
                }
                if (compareName==0){
                    int compareId= teacherList.get(j).getInteger().compareTo(teacherList.get(j + 1).getInteger());
                    if (compareId>0){
                        isSwap = true;
                        teacher = teacherList.get(j + 1);
                        teacherList.set(j + 1, teacherList.get(j));
                        teacherList.set(j, teacher);
                    }
                }
            }
        }
        displayTeacher();
    }


    public static Teacher infoTeacher() {
        System.out.print("Mời bạn nhập mã giảng viên: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Mời bạn nhập tên giảng viên: ");
        String name = scanner.nextLine();
        System.out.println("Mời bạn nhập ngày sinh giảng viên: ");
        String dateOfBirth = scanner.nextLine();
        System.out.print("Mời bạn nhập giới tính giảng viên: ");
        String sex = scanner.nextLine();
        System.out.print("Mời bạn nhập chuyên môn: ");
        String specialize = scanner.nextLine();
        Teacher teacher = new Teacher(id, name, dateOfBirth, sex, specialize);
        return teacher;
    }

}
