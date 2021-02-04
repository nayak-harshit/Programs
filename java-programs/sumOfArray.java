import java.util.Scanner;
public class sumOfArray {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of numbers to add:");// number of elements to add
        int k = sc.nextInt();
        int array[] ;
        array = new int[k];
        for (int j = 0; j < array.length; j++) //for loop to assign elements in array
        {
            System.out.println("Enter the element"+j);
            array[j] = sc.nextInt(); 
        }
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println("sum of array is :" +sum);
        sc.close();

    }
}
