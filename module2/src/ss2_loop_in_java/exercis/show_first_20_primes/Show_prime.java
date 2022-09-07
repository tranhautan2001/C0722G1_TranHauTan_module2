package ss2_loop_in_java.exercis.show_first_20_primes;
public class Show_prime {


    public static void main(String[] args) {
        int n = 2;
        int countingPrimes = 0;
        while (countingPrimes < 20) {
            int count = 0;
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(n);
                countingPrimes++;
            }
            n++;
        }

    }

}








