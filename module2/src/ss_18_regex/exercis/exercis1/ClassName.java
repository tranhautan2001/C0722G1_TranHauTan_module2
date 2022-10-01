package ss_18_regex.exercis.exercis1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassName {
    public static final String CLASS_NAME = "^[C|A|P]\\d{4}[ G| H| I| K| L| M]$";
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            Pattern pattern = Pattern.compile(CLASS_NAME);
            System.out.println("Mời bạn nhập tên lớp : ");
            String input = scanner.nextLine();
            Matcher matcher = pattern.matcher(input);
            if (matcher.matches()) {
                System.out.println("nhập đúng định dạng --> OK "+"\n");
                break;
            } else {
                System.out.println("nhập sai định dạng !"+"\n");
                System.out.println();
            }
        }
    }
}
