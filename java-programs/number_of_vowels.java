public class number_of_vowels {
    public static void main(String[] args) {
       System.out.println(vowles("aeiou")); 
    }

    static int vowles(String s ){
        int vowel = 0;
        for (int i = 0; i < s.length(); i++) {
            char v = s.charAt(i);
            if(v == 'a' || v =='A' ||
               v == 'e' || v == 'E' ||
               v == 'i' || v == 'I' ||
               v == 'o' || v == 'O' ||
               v == 'u' || v == 'U' )
               {
                   vowel++;
               }
        }
        return vowel;
    }
}
