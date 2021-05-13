import java.util.Random;

public class PasswordGenerator {
    public static void main(String[] args) {
        System.out.println(generatePass(16));
    }


    public static String generatePass(int length) {
        Random random =new Random();
        String Capital_chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String Small_chars = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String symbols = "!@#$%^&*_=+-/.?<>)";
        String values = Capital_chars + Small_chars +
                numbers + symbols;

        String password = "";
        for (int i = 0; i < length; i++) {
            int a = random.nextInt(values.length());
            password += values.charAt(a);
        }
        return password;
    }
}

