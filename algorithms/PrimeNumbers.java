import java.util.Arrays;

public class PrimeNumbers {
    public static void main(String[] args) {
        boolean[] b = seiveOfEratosthenes(10000);
        for (int i = 0; i < b.length; i++) {
            if (b[i]) {
                System.out.println(i + ": " + b[i]);
            }
        }
    }

    public static boolean[] seiveOfEratosthenes(int n) {
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;
        for (int i = 2; i * i < isPrime.length; i++) {
            for (int j = (i + i); j < isPrime.length; j += i) {
                isPrime[j] = false;
            }
        }

        return isPrime;
    }
}
