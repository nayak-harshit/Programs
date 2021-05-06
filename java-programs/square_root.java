/**  In Java there is a pre-defined method to find the square-root of a number.
*   But in this program I'm going to use the babylonian method to find it.
*   @author NAYAK
**/

class square_root{
   public static void main(String[] args) {
        System.out.println(sqrt(4));
   }

   public static float sqrt(int num){
        float x = num;
        float y = 1;
        double a = 0.000001;// a is the number of digits to be accurate
        while ((x-y)>a) {
            x = (x + y)/2;
            y = num/2;
        }
        return x;
   }


}
