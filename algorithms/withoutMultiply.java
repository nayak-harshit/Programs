/**
 * withoutMultiply
 */
public class withoutMultiply {

    public static void main(String[] args) {
        
        System.out.println(multiply(50, -2));

    }

    public static int multiply(int a, int b) {

        if(b==0)return 0;

        if(b==1)return a; 

        if(b>0){
            for (int i = 1; i < b; i++) {
                return a + multiply(a, b-i);
            }
        }

        if(b<0){
            b = Math.abs(b);
            for (int i = 1; i < b; i++) {
                return -(a + multiply(a, b-i));
            }
        }

        return -1;
    }
        
}