import java.util.ArrayList;
import java.util.Arrays;

public class primeFactors {
    public static void main(String[] args) {
        System.out.println(isPrime(999999937));
        System.out.println(nextPrime(7));
        
        ArrayList<Integer> arr = primeFactorisation(50);
        
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }

        String result = displayPrimeFactor(50, arr);
        System.out.println(result);

    }

    /**
     * @return if n is a factor of x
     */
    public static boolean isFactor(int x, int n) {
        if (x % n == 0)
            return true;
        return false;
    }

    /**
     * 
     * @param n
     * @return if a number is prime
     */
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

    /**
     * 
     * @param a
     * @return the next prime number after a
     */
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

    /**
     * 
     * @param n
     * @return arraylist of all prime factors of n
     */
    public static ArrayList<Integer> primeFactorisation(int n) {
        ArrayList<Integer> primeFactors = new ArrayList<Integer>();
        int quot = n;

        int factor = 2;
        while (quot != 1) {
            if (isFactor(quot, factor)) {
                primeFactors.add(factor);
                quot = quot / factor;
            } else {
                factor = nextPrime(factor);
            }
        }

        return primeFactors;

    }

    public static String displayPrimeFactor(int num, ArrayList arrayList) {
        String result = "Factors of "+num +": \n";
        int n = arrayList.size();

        boolean visited[] = new boolean[n];
        Arrays.fill(visited, false);

        for (int i = 0; i < n; i++) {
            if (visited[i])
                continue;

            int frequency = 0;
            for (int j = i; j < n; j++) {
                if(arrayList.get(i) == arrayList.get(j)){
                    visited[j] = true;
                    frequency++;
                }
            }
            result+= arrayList.get(i) + "^" +  frequency +" \n" ;

        }

        // do{
        // int i = (Integer)arrayList.get(n);
        // int frequency = 0;
        // while(i == (Integer)arrayList.get(n)){
        // frequency++;
        // if(i != (Integer)arrayList.get(n+1)){
        // result+= i + "^"+ frequency + " ";
        // continue;
        // }

        // n++;
        // }

        // n++;
        // }while((Integer)arrayList.size() != n+1);

        return result;
    }

}
