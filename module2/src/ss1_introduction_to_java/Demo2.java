package ss1_introduction_to_java;

import com.sun.xml.internal.fastinfoset.util.StringArray;

import java.sql.Array;
import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số");
        int number = scanner.nextInt();

        if (number <=10 && number >= 0) {
            String[] arrayOne ={"zero", "one","two","three","four","five","six","seven","eight","nice","ten"};
            System.out.println(arrayOne[number]);
        }
        if (number>10 && number < 20){
            String[] arrayTwo ={"eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
            System.out.println(arrayTwo[number-11]);
        }
        if (number<100 ){
            String[] arrayFour ={"","","twenty","thirty","fourty","fifty","sixty","seventy","eightty","ninety",};
            System.out.println(arrayFour[number/10]);
        }
        if (number<1000){
            String[] arrayThree ={"","onehundreds","twohundreds","threehundreds","fourhundreds","fivehundreds","sixhundreds","sevenhundreds","eighthundreds","ninehundreds"};
            System.out.println(arrayThree[number/100]);
        }
        }

    }