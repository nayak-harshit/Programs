/* ALGORITHM of BUBBLE SORT :-
*   If there is an array [5, 3, 6, -3, 7]
*   first consider 5 and 3 and check
*       if 5 is greater than 3
*           if yes then swap them.
*       now, the array is [ 3, 5, ..]
*   again check it for 5 and 6
*       now the array is [3, 5, 6, ..]
*    repeat this until the greatest integer gets to the last, as
*       [ 3, 5, -3, 6, 7]
*   ->[3, -3, 5, 6, 7]
*   ->[-3, 3, 5, 6, 7] ==> here the array gets sorted.
*
* @author NAYAK
* */

public class Bubble_Sort {
    public static void main(String[] args) {
        int[] ar = new int[5];
        ar[0] = 1;
        ar[1] = -5;
        ar[2] = 2;
        ar[3] = 9;
        ar[4] = 3;

        int[] s = bubblesort(ar);
        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i]);
            System.out.print(", ");
        }
    }
    public static int[] bubblesort(int a[]){
        for (int i = 0; i <= a.length-1; i++) {

            for (int j = i; j < a.length-1-i; j++) {
                if(a[j] > a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }

        return a;
    }
}
