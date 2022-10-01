package ss_18_regex.exercis.exercis2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumber {

    public static final String REGEX_PHONE_NUMBER = "^84\\d{9}$";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pattern pattern = Pattern.compile(REGEX_PHONE_NUMBER);
        System.out.println("nhập số điện thoại để kiểm tra :");
        String input = scanner.nextLine();
        Matcher matcher = pattern.matcher(input);
        if (matcher.matches()){
            System.out.println("nhập đúng định dạng");
        }else {
            System.out.println("nhập sai định dạng");
        }
    }
}
