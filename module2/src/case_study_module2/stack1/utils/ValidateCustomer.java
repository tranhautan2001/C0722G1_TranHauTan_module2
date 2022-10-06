package case_study_module2.stack1.utils;

import case_study_module2.stack1.exeception.*;

import java.util.Scanner;

public class ValidateCustomer {
    static Scanner scanner = new Scanner(System.in);

    public static int getID() {
        int id;
        while (true) {
            System.out.println("mời bạn nhập mã khách hàng :");
            id = Integer.parseInt(scanner.nextLine());
            try {
                if (id < 0) {
                    throw new CheckNumberException("nhập sai định dạng");
                }
                break;
            } catch (CheckNumberException e) {
                System.out.println(e.getMessage());
            }
        }
        return id;
    }

    public static String getName() {
        String name;
        while (true) {
            System.out.println("mời bạn nhập tên khách hàng : ");
            name = scanner.nextLine();
            try {
                if (name.matches("^([A-Z][a-z]{1,6}\\s)*[A-Z][a-z]{1,6}$")) {
                    System.out.println("thêm thành công");
                } else {
                    throw new CheckNameException("nhập sai định dạng --> nhập lại");
                }
                break;
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

    public static String getTypeOfGuest() {
        String typeOfGuest;
        while (true) {
            try {
                System.out.println("mời bạn chọn Loại khách hàng : \n" +
                        "1. Diamond \n" +
                        "2. Platinium \n" +
                        "3. Gold \n" +
                        "3. Silver \n" +
                        "4. Member \n" +
                        "5. Trở về menu");
                int choice = Integer.parseInt(scanner.nextLine());
                boolean flagCheck = false;
                switch (choice) {
                    case 1:
                        typeOfGuest = "Diamond";
                        flagCheck = true;
                        break;
                    case 2:
                        typeOfGuest = "Platinium";
                        flagCheck = true;
                        break;
                    case 3:
                        typeOfGuest = "Gold";
                        flagCheck = true;
                        break;
                    case 4:
                        typeOfGuest = "Silver";
                        flagCheck = true;
                        break;
                    case 5:
                        typeOfGuest = "Member";
                        flagCheck = true;
                        break;
                    default:
                        typeOfGuest = null;
                        System.out.println("Nhập lại.");
                }
                if (flagCheck) {
                    break;
                } else {
                    throw new CheckLeverException("Nhập sai định dạng --> nhập lại :");
                }
            } catch (CheckLeverException e) {
                System.out.println(e.getMessage());
            }

        }
        return typeOfGuest;
    }
}
