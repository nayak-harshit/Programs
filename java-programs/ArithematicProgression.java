import java.util.Scanner;

public class ArithematicProgression{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you have first 3 terms of the AP?");
        boolean isAP = sc.nextBoolean();
        if (isAP) {
            System.out.println("Enter the 1st term:");
            double a = sc.nextDouble();
            
            System.out.println("Enter the 2nd term:");
            double b = sc.nextDouble();
            
            System.out.println("Enter the 3rd term:");
            double c = sc.nextDouble();

            System.out.println("Enter the lastTermPosition:");
            int l = sc.nextInt();

            if(hasAP(a, b, c, l))System.out.println("THANK you");
            else System.out.println("See you again!");

        } else {
            System.out.println("Do you have the 1st term and common difference between the terms?");
            boolean hasit = sc.nextBoolean();
            if (hasit){
                System.out.println("Enter the first term:");
                double a = sc.nextDouble();

                System.out.println("Enter the Common Difference");
                double d = sc.nextDouble();

                System.out.println("Enter the lastTermPosition:");
                int l = sc.nextInt();

                hasAandD(a,d,l);


            }

        }

    }
    
    public static boolean hasAP(double a, double b, double c, int lastTermPosition) {
        if((b-a)!=(c-b)){
            System.out.println("Wrong Arithematic Progression \n The provided series is not an AP");
            return false;
        }
        double commonDifferernce = b-a;
        System.out.println("Common Difference: " +commonDifferernce);

        double lastTerm = a+((lastTermPosition-1)*commonDifferernce);
        System.out.println("Last Term: " + lastTerm);

        double sum = ((double)(lastTermPosition)/2)*(a+lastTerm);
        System.out.println("Sum of series: " +sum);
        return true;

    }

    public static void hasAandD(double a, double d, int lastTermPosition){
        double lastTerm = a+((lastTermPosition-1)*d);
        System.out.println("Last Term: " + lastTerm);

        double sum = ((double)(lastTermPosition)/2)*(a+lastTerm);
        System.out.println("Sum of series: " +sum);

    }
    
}
