package ss4_classes_and_objects_in_java.exercis.class_of_quadratic_equations;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập a");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.println("nhập b");
        double b = Double.parseDouble(scanner.nextLine());
        System.out.println("nhập c");
        double c = Double.parseDouble(scanner.nextLine());
        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        double delta = quadraticEquation.getDiscriminant();
        if(delta > 0){
            System.out.println(quadraticEquation.getRoot1()+"  "+quadraticEquation.getRoot2());
        }else if (delta==0){
            System.out.println(quadraticEquation.getRoot1());
        }else {
            System.out.println("The equation has no roots");
        }
    }
}
