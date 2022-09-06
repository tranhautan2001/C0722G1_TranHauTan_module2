package ss1_introduction_to_java.exercis.show_greetings;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("enter your name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("hello: "+name);
    }
}
