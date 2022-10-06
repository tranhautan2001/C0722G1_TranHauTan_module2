package case_study_module2.stack1.utils;

import case_study_module2.stack1.exeception.*;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ValidateEmployee {
    static Scanner scanner = new Scanner(System.in);

    public static int getId() {
        int id;
        while (true) {
            System.out.println("mời bạn nhập mã nhân viên :");
            try {
                id = Integer.parseInt(scanner.nextLine());
                if (id <= 0) {
                    throw new CheckNumberException("nhập sai định dạng");
                }
                break;
            } catch (CheckNumberException e) {
                e.printStackTrace();
            } catch (NumberFormatException e) {
                System.out.println("không nhập chữ");
            }
        }
        return id;
    }

    public static String getName() {
        String name;
        while (true) {
            System.out.println("mời bạn nhập tên nhân viên :");
            name = scanner.nextLine();
            try {
                if (name.matches("^([A-Z][a-z]{1,6}\\s)*[A-Z][a-z]{1,6}$")) {
                    System.out.println("thêm thành công");
                    break;
                } else {
                    throw new CheckNameException("nhập sai định dạng --> nhập lại : ");
                }
            } catch (CheckNameException e) {
                System.out.println(e.getMessage());
            }
        }
        return name;
    }

    public static String getDateOfBirth() {
        String dateOfBirth;
        while (true) {
            System.out.println("mời bạn nhập ngày sinh nhân viên theo định dạng dd/mm/YYYY  :");
            dateOfBirth = scanner.nextLine();
            try {
                if (dateOfBirth.matches("^(0[1-9]|[12][0-9]|3[01])[- /.](0[1-9]|1[012])[- /.](19|20)\\d\\d$")) {
                    System.out.println("thêm thành công");
                    break;
                } else {
                    throw new CheckDateOfBirth("nhập sai đinh dạng --> nhập lại : ");
                }
            } catch (CheckDateOfBirth e) {
                System.out.println(e.getMessage());
            }
        }
        return dateOfBirth;
    }

    public static String getSex() {
        String sex;
        while (true) {
            System.out.println("mời bạn nhập giới tính ");
            sex = scanner.nextLine();
            try {
                if (sex.matches("^(NAM)|(NU)|(EGBT)$")) {
                    System.out.println("thêm thành công");
                    break;
                } else {
                    throw new CheckGenderExeception("nhập sai đinh dạng --> nhập lại :");
                }
            } catch (CheckGenderExeception e) {
                System.out.println(e.getMessage());
            }
        }
        return sex;
    }

    public static String getIdCard() {
        String idCard;
        while (true) {
            System.out.println("mời bạn nhập số CMND");
            idCard = scanner.nextLine();
            try {
                if (idCard.matches("^[0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]$")) {
                    System.out.println("thêm mới thành công");
                    break;
                } else {
                    throw new CheckIdCardException("nhập sai định dạng --> nhập lại ");
                }

            } catch (CheckIdCardException e) {
                System.out.println(e.getMessage());
            }
        }
        return idCard;
    }

    public static String getPhoneNumber() {
        String phoneNumber;
        while (true) {
            System.out.println("mời bạn nhập số điện thoại ");
            try {
                phoneNumber = scanner.nextLine();
                if (phoneNumber.matches("^84\\d{9}$")) {
                    System.out.println("thêm thành công ");
                    break;
                } else {
                    throw new CheckNumberException("nhập sai định dạng --> nhập lại");
                }
            } catch (CheckNumberException e) {
                System.out.println(e.getMessage());
            }
        }
        return phoneNumber;
    }

    public static String getEmail() {
        String email;
        while (true) {
            System.out.println("mời bạn nhập email");
            email = scanner.nextLine();
            try {
                if (email.matches("^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$")) {
                    System.out.println("thêm thành công");
                    break;
                } else {
                    throw new CheckEmailException("nhập sai định dạng --> nhập lại");
                }
            } catch (CheckEmailException e) {
                System.out.println(e.getMessage());
            }
        }
        return email;
    }

    public static String getLever() {
        String lever;
        while (true) {
            try {
                System.out.println("mời bạn chọn trình độ nhân viên : \n" +
                        "1. Trung cấp \n" +
                        "2. Cao đẳng \n" +
                        "3. Đại học \n" +
                        "4. Tự do ");
                int choice = Integer.parseInt(scanner.nextLine());
                boolean flagCheck = false;
                switch (choice) {
                    case 1:
                        lever = "Trung cấp";
                        flagCheck = true;
                        break;
                    case 2:
                        lever = "Cao đẳng";
                        flagCheck = true;
                        break;
                    case 3:
                        lever = "Đại học";
                        flagCheck = true;
                        break;
                    case 4:
                        lever = "Tự do";
                        flagCheck = true;
                        break;
                    default:
                        lever = null;
                        System.out.println("Nhập lại.");
                }
                if (flagCheck) {
                    break;
                } else {
                    throw new CheckLeverException("nhập sai định dạng --> nhập lại");
                }

            } catch (CheckLeverException e) {
                System.out.println(e.getMessage());
            }
        }
        return lever;
    }

    public static String getLocation() {
        String location;
        while (true) {
            try {
                System.out.println("mời bạn chọn trình độ nhân viên : \n" +
                        "1. Lễ tân \n" +
                        "2. Phục vụ \n" +
                        "3. Chuyên viên \n" +
                        "4. Giám sát \n" +
                        "5. Quản lý \n" +
                        "6. Giám đốc");
                int choice = Integer.parseInt(scanner.nextLine());
                boolean flagCheck = false;
                switch (choice) {
                    case 1:
                        location = "Lễ tân";
                        flagCheck = true;
                        break;
                    case 2:
                        location = "Phục vụ";
                        flagCheck = true;
                        break;
                    case 3:
                        location = "Chuyên viênc";
                        flagCheck = true;
                        break;
                    case 4:
                        location = "Giám sát";
                        flagCheck = true;
                        break;
                    case 5:
                        location = "Quản lý";
                        flagCheck = true;
                        break;
                    case 6:
                        location = "Giám đốc";
                        flagCheck = true;
                        break;
                    default:
                        location = null;
                        System.out.println("Nhập lại.");
                }
                if (flagCheck) {
                    break;

                } else {
                    throw new CheckLeverException("nhập sai định dạng --> nhập lại");
                }

            } catch (CheckLeverException e) {
                System.out.println(e.getMessage());
            }
        }
        return location;
    }

    public static double getWage() {
        double wage;
        while (true) {
            System.out.println("mời bạn nhập lương nhân viên ");
            try {
                wage = Double.parseDouble(scanner.nextLine());
                if (wage < 0) {
                    throw new CheckwageExeception("nhập sai định dạng --> nhập lại ");
                }
                break;
            } catch (CheckwageExeception e) {
                System.out.println(e.getMessage());
            }
        }
        return wage;
    }
}