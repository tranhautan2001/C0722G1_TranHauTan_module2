package ss10_dsa_danh_sach.exercis.bai_lam_them_haiTT.controller;

import ss10_dsa_danh_sach.exercis.bai_lam_them_haiTT.service.ITeacherService;
import ss10_dsa_danh_sach.exercis.bai_lam_them_haiTT.service.impl.TeacherService;


import java.util.Scanner;

public class TeacherController {
    private ITeacherService iTeacherService = new TeacherService();
    private Scanner scanner = new Scanner(System.in);

    public void menuTeacher(){
        do {
            System.out.println("---CHƯƠNG TRÌNH QUẢN LÝ GIẢNG VIÊN--- \n" +
                    "1. Thêm mới giảng viên \n" +
                    "2. Xóa giảng viên \n" +
                    "3. Xem danh sách giảng viên \n"  +
                    "4. Tìm kiếm giảng viên \n" +
                    "5. Sắp xếp giảng viên \n" +
                    "6. Trở về menu chính");
            System.out.println("---------------------------");
            System.out.println("---------------------------");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice){
                case 1:{
                    iTeacherService.addTeacher();
                    break;
                }
                case 2:{
                    iTeacherService.removeTeacher();
                    break;
                }
                case 3:{
                    iTeacherService.displayTeacher();
                    break;
                }
                case 4:{
                    iTeacherService.seachTeacher();
                    break;
                }
                case 5:{
                    iTeacherService.sortTeacher();
                    break;
                }
                case 6:{
                    return;
                }
            }
        }while (true);
    }
}
