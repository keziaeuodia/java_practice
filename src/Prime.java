import java.util.Arrays;

public class Prime {

    //generates first n prime numbers
    public static String generatePrime(int n) {
        int [] prime = new int[n];

        int i = 2;
        int j = 0;

        while (j < prime.length){
            if (isPrime(i)) {
                prime[j] = i;
                i++;
                j++;
            }else i++;
        }

        return Arrays.toString(prime);
    }

    //checking if the number is prime
    public static boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(generatePrime(8));
    }
}
