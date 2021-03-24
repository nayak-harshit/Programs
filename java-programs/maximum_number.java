import java.util.Arrays;
/**
 * @author NAYAK
 * @see https://practice.geeksforgeeks.org/problems/find-maximum-number2152/1/?category[]=Mathematical&category[]=Strings&category[]=Mathematical&category[]=Strings&problemType=functional&difficulty[]=0&page=1&query=category[]Mathematicalcategory[]StringsproblemTypefunctionaldifficulty[]0page1category[]Mathematicalcategory[]Strings
 * 
 * not working in this state...
 */
public class maximum_number {
    public static void main(String[] args) {
        max_num(12345);
    }
    /**
     * 
     * @param a
     */
    public static void max_num(int a){
        
        String maxstr = Integer.toString(a);
         int length = maxstr.length();
         int len[] = new int[length];
         for (int i = 0; i < len.length; i++) {
             len[i] = maxstr.charAt(i);
         }        // now len array has the digits of int a

        Arrays.sort(len);
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < len.length; i++) {
            s.append(len[i]);
        }

            System.out.println(s);
    }
}
