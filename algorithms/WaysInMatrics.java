public class WaysInMatrics {
    public static void main(String[] args) {
        System.out.println(waysToGo(2,2));
    }

    /**
     * Qns:- You have a matrics of 'n' x 'm' size and we have to find the number of
     * ways to to go from one end to other(the corner ends diagonally) You can only
     * go to right or down and no other directions...
     */

    public static int waysToGo(int n, int m) {
        if (n == 1 || m == 1) {
            return 1;
        }
        return (waysToGo(n - 1, m) + waysToGo(n, m - 1));
    }

}
