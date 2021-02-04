public class array {
    public static void main(String[] args) {
        // array decleration type 1
        int []a = {1, 23, 12, 45,};
        // array decleration type 2
        int []b;
        b = new int[5];
        b[0] = 12;
        b[1] = 2;
        b[2] = 1;
        b[3] = 142;
        b[4] = 125;
        // array decleration type 3
        int[] c = new int [5];
        // ascessing arrays METHOD 1:-
        System.out.println(b[0]);
        // ascessing arrays METHOD 2(using for loop):-
        for (int i=0; i<a.length; i++)
        {
                    System.out.println(a[i]);
        }
                // ascessing arrays METHOD 3(using for each loop):-
           for (int i: b) {  
         System.out.println(i);
           }

           
    }
}
