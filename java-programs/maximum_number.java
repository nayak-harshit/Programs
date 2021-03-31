import java.util.Arrays;
/**
 * @author NAYAK
 * @see https://practice.geeksforgeeks.org/problems/find-maximum-number2152/1/?category[]=Mathematical&category[]=Strings&category[]=Mathematical&category[]=Strings&problemType=functional&difficulty[]=0&page=1&query=category[]Mathematicalcategory[]StringsproblemTypefunctionaldifficulty[]0page1category[]Mathematicalcategory[]Strings
 * 
  not working in this state...
  Expected work from the program-
    Input:
    N = "38293367"
    Output:
    98763332 
    Explanation:
    98763332 is the largest number that
    can be formed by rearranging the
    digits of N.
 */
public class maximum_number {
    public static void main(String[] args) {
        // max_num(12345);
        Solution s = new Solution();
        System.out.println(s.findMax("1234")); 
    }

    /**
     * 
     * @param a
     */
    public static void max_num(int a) {

        String maxstr = Integer.toString(a);// convert the integer into string
        int length = maxstr.length();// number of digits
        int len[] = new int[length]; // creating an array with length of number of digits
        for (int i = 0; i < len.length; i++) {
            len[i] = maxstr.charAt(i); // assigning the digits into array
        } // now len array has the digits of int a

        Arrays.sort(len); // sorting the array so that largest number are in first
        StringBuilder s = new StringBuilder(); // using stringbuilder bcoz they are muitable
        for (int i = 0; i < len.length; i++) {
            s.append(len[i]); // adding the sorted digits into stringbuilder
        }

        System.out.println(s);// printing the final result...
    }
}

/**
 * solution from gfg
 */
class Solution {
    String findMax(String N) {
        
        int[] freq = new int[10];
        Arrays.fill(freq,0);     // Initializing frequency of all digits as 0.
        
        for(int i=0 ; i<N.length() ; i++)
            freq[N.charAt(i)-'0']++;    // Incrementing the count of digits upon visiting
            
        String ans = "";
        for(int i=9 ; i>=0 ; i--)
        {
            for(int j=0 ; j<freq[i] ; j++)
                ans+=((char)(i+'0'));     // Finally add all the digits to the final string from 9 to 0.
        }
        
        return ans;
    }
}
