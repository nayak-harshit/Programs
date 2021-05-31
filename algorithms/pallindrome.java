public class pallindrome {
public static void main(String[] args) {
    System.out.println(isPallidrome("121"));
}
public static boolean isPallidrome(String a) {
    return (a.equals(reverseString(a)));

}
public static String reverseString (String a) {
    char[] arr  = a.toCharArray();
    int len = arr.length;
    char[] revArr = new char[len];
    for (int i = 0; i < len; i++) {
        revArr[len-i] = arr[i]; 
    }
    return revArr.toString();
    
}

}
