import java.util.Arrays;

/***
 * An array of data- {0,3,23,232,23,234,4,56,7,87,}
 * Methods ot find:
 *      mean
 *      median
 *      mode
 *      frequency of all members
 *      max
 *      min
 *
 * */
public class data {
    public static void main(String[] args) {
        double[] a = {1,1,1,5,25,1,1,2,12,0,23,23,23,23};
        System.out.println( mean(a));
        System.out.println( median(a));
        System.out.println(frequencyOf(a,1));
    }

    public static double mean(double[] arr){
        return (Arrays.stream(arr).sum()/arr.length);
    }

    public static double median(double[] arr){
        Arrays.sort(arr);
        int length =arr.length;
        /*
        * if the length of array is even then the median is
        * the average of 2 elements in between
        * */
        if(length % 2 == 0) {
            int index1 = length / 2;
            int index2 = (length / 2)+1;
            return (arr[index1] + arr[index2]) / 2;
        }
        int a =(length/2)+1;
        return arr[a];

    }
    public static int frequencyOf(double[] arr, double a){
       int fre = 0;
        for (int i = 0; i <arr.length ; i++) if (arr[i] == a) fre++;
        return fre;

    }


}
