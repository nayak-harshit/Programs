import java.util.Arrays;

/*
    @author NAYAK
    @version 2
    @seek nayak

    An anagram of a string is another string that contains the same characters,
    only the order of characters can be different.
    For example, abcd and dabc are an anagram of each other.
    Anagram Words:-
    Listen - Silent
    Triangle - Integral

*/
public class Anagram_strings {
    public static void main(String[] args) {
        System.out.println(anagram("harshit", "nayak"));
    }
    /**
    * @param a this is 1st string
    * @param b this is 2nd string
    * @return boolean if it is anagram or not
    *   */
    public static boolean anagram(String a, String b){
        char[] ar = a.toCharArray();
        char[] br = b.toCharArray();
        Arrays.sort(ar);
        Arrays.sort(br);
        if(ar.length == br.length){
            boolean eq = true;
          equal:  for (int i = 0; i <ar.length ; i++) {
                if(ar[i] != br[i]){
                    eq = false;
                    break equal;
                }
          }
            return eq;
        }
        return false;
    }

}
