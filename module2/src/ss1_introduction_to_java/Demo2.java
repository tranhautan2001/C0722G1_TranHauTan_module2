package ss1_introduction_to_java;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số");
        int number = scanner.nextInt();
        String[] arrayOne = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nice", "ten"};
        String[] arrayTwo = {"eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] arrayThree = {"", "", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eightty", "ninety",};
        String[] arrayFour = {"", "onehundreds", "twohundreds", "threehundreds", "fourhundreds", "fivehundreds", "sixhundreds", "sevenhundreds", "eighthundreds", "ninehundreds"};
        if (number <= 10 && number >= 0) {
            System.out.println(arrayOne[number]);
        }
        if (number > 10 && number < 20) {
            System.out.println(arrayTwo[number % 11]);
        }
        if (number < 100 && number >= 20) {
            System.out.print(arrayThree[number / 10] + " " + arrayOne[number % 10]);
        }
        if (number < 1000 && number >= 100) {
            if (number % 100 <= 10 && number % 100 >= 0) {
                System.out.println(arrayFour[number / 100] + " " + arrayOne[number % 100]);
            }
            if (number%100 > 10 && number%100 < 20) {
                System.out.println(arrayFour[number/100]+ " " + arrayTwo[(number%100)%11]);

            }
            if (number%100 < 100 && number%100 >= 20) {
                System.out.println(arrayFour[number / 100]+" "+arrayThree[(number%100)/10]+" "+arrayOne[number%10]);
            }

        }
    }


}
