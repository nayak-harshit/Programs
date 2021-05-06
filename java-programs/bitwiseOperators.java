public class bitwiseOperators {
//    Bitwise OR (|) –
//    This operator is a binary operator, denoted by ‘|’. It returns bit by bit OR of input values, i.e, if either of the bits is 1, it gives 1, else it gives 0.
//    For example,
//            a = 5 = 0101 (In Binary)
//    b = 7 = 0111 (In Binary)
//
//    Bitwise OR Operation of 5 and 7
//            0101
//           |0111
//           ________
//              0111  = 7 (In decimal)
//    Bitwise AND (&) –
//    This operator is a binary operator, denoted by ‘&’. It returns bit by bit AND of input values, i.e, if both bits are 1, it gives 1, else it gives 0.
//    For example,
//            a = 5 = 0101 (In Binary)
//    b = 7 = 0111 (In Binary)
//
//    Bitwise AND Operation of 5 and 7
//            0101
//            & 0111
//    ________
//  0101  = 5 (In decimal)
//    Bitwise XOR (^) –
//    This operator is a binary operator, denoted by ‘^’. It returns bit by bit XOR of input values, i.e, if corresponding bits are different, it gives 1, else it gives 0.
//    For example,
//            a = 5 = 0101 (In Binary)
//    b = 7 = 0111 (In Binary)
//
//    Bitwise XOR Operation of 5 and 7
//            0101
//            ^ 0111
//    ________
//  0010  = 2 (In decimal)
//    Bitwise Complement (~) –
//    This operator is a unary operator, denoted by ‘~’. It returns the one’s complement representation of the input value, i.e, with all bits inverted, which means it makes every 0 to 1, and every 1 to 0.
//    For example,
//            a = 5 = 0101 (In Binary)
//
//    Bitwise Compliment Operation of 5
//
//            ~ 0101
//    ________
//  1010  = 10 (In decimal)
//    Note – Compiler will give 2’s complement of that number, i.e., 2’s complement of 10 will be -6.
public static void main(String[] args) {
    int a = 10;
    int b = 5;
    System.out.println(" a = " +a+ " and b = "+b);
    System.out.println("Bitwise OR operator: (a|b) is " +(a|b));
    System.out.println("Bitwise AND operator: (a&b) is " +(a&b));
    System.out.println("Bitwise XOR operator: (a^b) is " +(a^b));
    System.out.println("Bitwise XOR operator: ~a is " +~a);
    System.out.println("Bitwise XOR operator: ~b is " +~b);
    System.out.println("Bitwise Complement operator: ~(a^b) is " +~(a^b));
}

}
