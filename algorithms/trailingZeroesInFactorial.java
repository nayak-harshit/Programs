class trailingZeroesInFactorial{
    public static void main(String[] args) {
        System.out.println(TrailingZeroesInFactorial(100) );
    }
    public static int TrailingZeroesInFactorial(int a) {
        int result = 0;
        for (int i = 5; i <= a; i= i*5 ){
            result += a/i; 
        }
        return result;
    }
}