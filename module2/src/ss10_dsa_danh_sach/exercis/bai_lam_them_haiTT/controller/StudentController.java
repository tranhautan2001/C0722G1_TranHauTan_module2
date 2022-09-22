package ss10_dsa_danh_sach.exercis.bai_lam_them_haiTT.controller;

import ss10_dsa_danh_sach.exercis.bai_lam_them_haiTT.service.IStudentService;
import ss10_dsa_danh_sach.exercis.bai_lam_them_haiTT.service.impl.StudentService;

import java.util.Scanner;

public class StudentController {
    private IStudentService iStudentService = new StudentService();
    private Scanner scanner = new Scanner(System.in);

    public void menuStudent() {
        do{
            System.out.println("---CHƯƠNG TRÌNH QUẢN LÝ SINH VIÊN--- \n" +
                    "1. Thêm mới sinh viên \n" +
                    "2. Xóa sinh viên \n" +
                    "3. Xem danh sách sinh viên \n" +
                    "4. Tìm kiếm sinh viên \n" +
                    "5. Trở về menu chính");
            System.out.println("---------------------------");
            System.out.println("---------------------------");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice){
                case 1:{
                    iStudentService.addStudent();
                    break;
                }
                case 2:{
                    iStudentService.removeStudent();
                    break;
                }
                case 3:{
                    iStudentService.displayStudent();
                    break;
                }
                case 4:{
                    iStudentService.seachStudent();
                    break;
                }
                case 5: {
                    return;
                }
                }
        }while (true);
    }
}
