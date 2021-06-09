public class gcd {
    public static void main(String[] args) {

    }

    public static int gcdByRecursion(int a, int b) {
        if (a == 1) {
            return b;
        } else if (b == 1) {
            return a;
        }

        return(gcdByRecursion(a, b%a));
    }
}
