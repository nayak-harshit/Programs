public class pallindrome {
public static void main(String[] args) {
    System.out.println(isPalllindrome("aba"));
}
public static Boolean isPalllindrome (String a) {
    return a.equals(reverseString(a));
}

 public static String  reverseString(String s) {
    // String reverse = "";
    char[] sChar = s.toCharArray();
    char[] result = new char[sChar.length];
    for (int i = 0; i < sChar.length; i++) {
        result[i] = sChar[sChar.length-i-1];
    }      
    return String.valueOf(result);
 }
}
