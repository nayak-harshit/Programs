import java.util.ArrayList;

public class primeFactors {
    public static void main(String[] args) {
        System.out.println(isPrime(999999937));
        System.out.println(nextPrime(521164));
        ArrayList<Integer> arr = primeFactorisation(654213);
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
    }

    public static boolean isFactor(int x, int n) {
        if (x % n == 0)
            return true;
        return false;
    }

    public static boolean isPrime(int n) {
        if (n < 2)
            return false;
        if (n == 2 || n == 3)
            return true;
        if (n % 2 == 0 || n % 3 == 0)
            return false;

        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i - 2) == 0)
                return false;
        }

        return true;
    }

    public static int nextPrime(int a) {
        if (a < 2)
            return 2;
        int nextPrime = a + 1;
        boolean found = false;

        while (!found) {
            nextPrime++;
            if (isPrime(nextPrime))
                found = true;
        }
        return nextPrime;
    }

    public static ArrayList<Integer> primeFactorisation(int n) {
        ArrayList<Integer> primeFactors = new ArrayList<Integer>();
        int quot = n;
        for (int i = 2; i <n; i++) {
            
            if (isPrime(i) && isFactor(quot, i)) {
                 primeFactors.add(i);
                quot = quot/i;
            }
        }

        return primeFactors;

    }


}
