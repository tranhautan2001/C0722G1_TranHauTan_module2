package ss2_loop_in_java.exercis.show_types;

public class ShowType {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        for (int i = 0; i <= 5; i++) {
            for (int j = i; j < 5; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        for (int i = 0; i <5; i++) {
            for (int j = 0; j <5; j++) {
                if (j < 4-i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.print("\n");
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (j < i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.print("\n");
        }
    }
}

