/* Algo for Selection Sort(from: https://www.geeksforgeeks.org/selection-sort/?ref=leftbar-rightbar ):-
    * arr[] = 64 25 12 22 11

    // Find the minimum element in arr[0...4]
    // and place it at beginning
    11 25 12 22 64

    // Find the minimum element in arr[1...4]
    // and place it at beginning of arr[1...4]
    11 12 25 22 64

    // Find the minimum element in arr[2...4]
    // and place it at beginning of arr[2...4]
    11 12 22 25 64

    // Find the minimum element in arr[3...4]
    // and place it at beginning of arr[3...4]
    11 12 22 25 64
    *
* */
public class selection_sort {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 0;
        arr[1] = 5;
        arr[2] = 2;
        arr[3] = 9;
        arr[4] = 8;
        int[] sel = selectionsort(arr);
        for (int i = 0; i <sel.length ; i++) {
            System.out.print(sel[i] + ", ");
        }

    }

    public static int[] selectionsort(int[] a){
        int n = a.length;
        for (int i = 0; i <n-1 ; i++) {
                int minindex = i;

            for (int j = i+1; j <n-1 ; j++) {
                 if(a[j] < a[minindex]){
                     minindex = j;
                     // swapping the elements:
                     int temp = a[minindex];
                     a[minindex] = a[j];
                     a[j] = temp;
                 }
            }
        }
        return a;
    }
}
