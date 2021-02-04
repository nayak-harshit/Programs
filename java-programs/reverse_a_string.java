// Not working...//
// public class reverse_a_string {
//     public static void main(String[] args) {
//         String w = "word";
//         reverse(w);
//     }
    
//     static String reverse(String word){
//         String rev = "...";// the reversed string to be stotred in here...
//         for (int i = word.length(); i <0 ; i--) {
//             rev = rev + (word.charAt(i-1));
//         }
//         return rev;
//     }
// }//Not working...
// THis is working...
public class reverse_a_string{
    public static void main(String[] args) {
        String s = "hello";
    
        String rev = "...";

        for (int i = s.length(); i > 0; i--) {
            rev = rev +(s.charAt(i-1));
        }
        System.out.println(rev);
    }
}
