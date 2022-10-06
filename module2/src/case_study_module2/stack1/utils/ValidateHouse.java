package case_study_module2.stack1.utils;

import case_study_module2.stack1.exeception.CheckLeverException;
import case_study_module2.stack1.exeception.CheckNameException;
import case_study_module2.stack1.exeception.CheckNumberException;

import java.util.Scanner;

public class ValidateHouse {
    static Scanner scanner = new Scanner(System.in);

    public static String getID() {
        String id;
        while (true) {
            System.out.println("mời bạn nhập mã khách hàng");
            id = scanner.nextLine();
            try {
                if (id.matches("^[S][V][H][O][-][0-9]{4}$")) {
                    System.out.println("thêm thành công");
                    break;
                } else {
                    throw new CheckNumberException("nhập sai đinh dạng");
                }
            } catch (CheckNumberException e) {
                e.getMessage();
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

    public static double getArea() {
        double area;
        while (true) {
            System.out.println("mời bạn nhập diện tích ");
            area = Double.parseDouble(scanner.nextLine());
            try {
                if (area < 30) {
                    throw new CheckNumberException("nhập sai định dạng");
                }
                break;
            } catch (CheckNumberException e) {
                System.out.println(e.getMessage());
            }
        }
        return area;
    }

    public static int getCost() {
        int cost;
        while (true) {
            System.out.println("mời bạn nhập giá ");
            cost = Integer.parseInt(scanner.nextLine());
            try {
                if (cost < 0) {
                    throw new CheckNumberException("nhập sai định dạng");
                }
                break;
            } catch (CheckNumberException e) {
                System.out.println(e.getMessage());
            }
        }
        return cost;
    }

    public static int getPeople() {
        int people;
        while (true) {
            System.out.println("mời bạn nhập số lượng người ");
            people = Integer.parseInt(scanner.nextLine());
            try {
                if (people < 0 && people > 20) {
                    throw new CheckNumberException("nhập sai định dạng");
                }
                break;
            } catch (CheckNumberException e) {
                System.out.println(e.getMessage());
            }
        }
        return people;
    }

    public static String getRentalType() {
        String rentalType;
        while (true) {
            try {
                System.out.println("mời bạn chọn kiểu thuê :\n" +
                        "1.Năm  \n " +
                        "2.Tháng  \n " +
                        "3.Ngày  \n " +
                        "4.Giờ ");
                int choice = Integer.parseInt(scanner.nextLine());
                boolean flagCheck = false;
                switch (choice) {
                    case 1:
                        rentalType = "Năm";
                        flagCheck = true;
                        break;
                    case 2:
                        rentalType = "Tháng";
                        flagCheck = true;
                        break;
                    case 3:
                        rentalType = "Ngày";
                        flagCheck = true;
                        break;
                    case 4:
                        rentalType = "Giờ";
                        flagCheck = true;
                        break;
                    default:
                        rentalType = null;
                        System.out.println("Nhập lại");
                }
                if (flagCheck) {
                    break;
                } else {
                    throw new CheckLeverException("nhập sai định dạng");
                }
            } catch (CheckLeverException e) {
                System.out.println(e.getMessage());
            }

        }
        return rentalType;
    }

    public static String getRoom() {
        String room;
        while (true) {
            try {
                System.out.println("mời bạn chọn kiểu thuê :\n" +
                        "1.Cao Cấp   \n " +
                        "2.Trung Cấp  \n " +
                        "3.Sơ Cấp ");
                int choice = Integer.parseInt(scanner.nextLine());
                boolean flagCheck = false;
                switch (choice) {
                    case 1:
                        room = "Cao Cấp";
                        flagCheck = true;
                        break;
                    case 2:
                        room = "Trung Cấp";
                        flagCheck = true;
                        break;
                    case 3:
                        room = "Sơ Cấp";
                        flagCheck = true;
                        break;
                    default:
                        room = null;
                        System.out.println("Nhập lại");
                }
                if (flagCheck) {
                    break;
                } else {
                    throw new CheckLeverException("nhập sai định dạng");
                }
            } catch (CheckLeverException e) {
                System.out.println(e.getMessage());
            }

        }
        return room;
    }

    public static int getNumberOfFloors() {
        int numberOfFloors;
        while (true) {
            System.out.println("mời bạn nhập số tầng ");
            numberOfFloors = Integer.parseInt(scanner.nextLine());
            try {
                if (numberOfFloors < 0) {
                    throw new CheckLeverException("nhập sai định dạng");
                }
                break;
            } catch (CheckLeverException e) {
                System.out.println(e.getMessage());
            }
        }
        return numberOfFloors;
    }

}
