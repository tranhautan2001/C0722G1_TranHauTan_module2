package ss10_dsa_danh_sach.exercis.bai_lam_them_haiTT.service.impl;

import ss10_dsa_danh_sach.exercis.bai_lam_them_haiTT.Utils.ReadFile;
import ss10_dsa_danh_sach.exercis.bai_lam_them_haiTT.Utils.WriteFile;
import ss10_dsa_danh_sach.exercis.bai_lam_them_haiTT.check_exception.CheckNameException;
import ss10_dsa_danh_sach.exercis.bai_lam_them_haiTT.check_exception.CheckNumberException;
import ss10_dsa_danh_sach.exercis.bai_lam_them_haiTT.model.Teacher;
import ss10_dsa_danh_sach.exercis.bai_lam_them_haiTT.service.ITeacherService;
import ss_16_text_file.exercis.exercis1.common.Writer;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TeacherService implements ITeacherService {
    private static Scanner scanner = new Scanner(System.in);
    private static final String PATH = "ss10_dsa_danh_sach\\exercis\\bai_lam_them_haiTT\\data\\teacher.txt";
    private static List<Teacher> teacherList = ReadFile.readTeacherFile(PATH);


    @Override
    public void addTeacher() {
        Teacher teacher = infoTeacher();
        teacherList.add(teacher);
        System.out.println("Thêm mới giảng viên thành công!");

        WriteFile.writeTeacherFile(PATH,teacherList);

    }

    @Override
    public void removeTeacher() {
        System.out.println("Nhập ID giảng viên cần xóa: ");
        int idRemove = Integer.parseInt(scanner.nextLine());
        boolean isFlag = false;

        for (Teacher teacher : teacherList) {
            if (teacher.getId() == idRemove) {
                System.out.println("Bạn có chắc muốn xóa giảng viên này? " +
                        "1. CÓ \n" +
                        "2. KHÔNG");
                int choiceYesNo = Integer.parseInt(scanner.nextLine());
                if (choiceYesNo == 1) {
                    teacherList.remove(teacher);
                    System.out.println("Xóa thành công! ");

                    WriteFile.writeTeacherFile(PATH,teacherList);
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
                        if (teacherList.get(i).getId() == ID) {
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
        boolean needNextPass = true;
        for (int i = 1; i < teacherList.size() && needNextPass; i++) {

            needNextPass = false;
            for (int j = 0; j < teacherList.size() - i; j++) {
                if (teacherList.get(j).getName().compareTo(teacherList.get(j + 1).getName()) > 0) {
                    Collections.swap(teacherList, j, j + 1);
                    needNextPass = true;
                }
            }
        }
        System.out.println("Danh sách sau sắp xếp: ");
        for (int i = 0; i < teacherList.size(); i++) {
            System.out.println(teacherList.get(i).toString());
        }
    }


    public static Teacher infoTeacher() {
        Scanner scanner = new Scanner(System.in);
        int id;
        do {
            System.out.print("Mời bạn nhập mã giảng viên : ");
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

                System.out.print("Mời bạn nhập tên giảng viên: ");
                name = scanner.nextLine();
              if (name.matches("^([A-Z][a-z]{1,6}\\s)*[A-Z][a-z]{1,6}$")){
                  System.out.println("thêm thành công");
                  break;
              }else {
                  System.out.println("thêm không thành công");
              }
        }
     //   ("[0-3][0-9]/[0,1][0-9]/\\d{4}")
        String dateOfBirth = "";
        do {
            Pattern pattern = Pattern.compile("^(0[1-9]|[12][0-9]|3[01])[- /.](0[1-9]|1[012])[- /.](19|20)\\d\\d$");
            System.out.println("Mời bạn nhập ngày sinh giảng viên: ");
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
        String specialize = "";
        do {
            System.out.println("Mời bạn nhập chuyên môn giảng viên : ");
            try {
                specialize = scanner.nextLine();
                for (int i = 0; i <specialize.length(); i++) {
                    if (Character.isDigit(specialize.charAt(i))){
                        throw new CheckNameException("nhập sai định dạng yêu cầu nhập số");
                    }
                }
                break;
            }catch (CheckNameException e){
                System.out.println("Yêu cầu nhập lại");
            }

        }while (true);
        Teacher teacher = new Teacher(id, name, dateOfBirth, sex, specialize);
        return teacher;
    }

}
