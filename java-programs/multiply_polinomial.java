/*
// the problem is solved now

   Problem from:- https://practice.geeksforgeeks.org/problems/multiply-two-polynomals0721/1/?category[]=Mathematical&category[]=Strings&category[]=Mathematical&category[]=Strings&problemType=functional&difficulty[]=0&page=1&query=category[]Mathematicalcategory[]StringsproblemTypefunctionaldifficulty[]0page1category[]Mathematicalcategory[]Strings

    Problem:-
    Input:
    M = 4, N = 3
    Arr1 = {1 , 0, 3, 2}
    Arr2 = {2, 0, 4}
    Output: {2, 0, 10, 4, 12, 8}
    Explanation:
    First polynomial: 
    1 + 0x^1 + 3x^2 + 2x^3
    Second polynomial: 
    2 + 0x^1 + 4x^2
    Product polynomial:
    2 + 0x^1 + 10x^2 + 4x^3 + 12x^4 + 8x^5
    * @author Nayak
    */
class multiply_polinomial{
    
    public static void main(String[] args) {
        System.out.println("Input:\n        M = 4, N = 3\n    +    Arr1 = {1 , 0, 3, 2}\n        Arr2 = {2, 0, 4}\n  " +
                "      Output:\n {2, 0, 10, 4, 12, 8}\n        Explaination: \n        First polynomial: \n        1 " +
                "+ 0x^1 + 3x^2 + 2x^3\n    +    Second polynomial: \n        2 + 0x^1 + 4x^2\n        Product " +
                "polynomial:\n     +   2 + 0x^1 + 10x^2 + 4x^3 + 12x^4 + 8x^5");

        int[] p = polynomial_multiply(4,3, new int[]{1, 0, 3, 2}, new int[]{2, 0, 4});
        System.out.println("asdf");
        for (int i:p   ) {
            System.out.println(i);
        }


    }
    /** 
     * 
     * @param sizeOfPoly1 it is the size of the array of polynomial1 (degree of polynomial+1)
     * @param sizeOfPoly2 it is the size of the array of polynomial2 (degree of polynomial+2)
     * @param poly1
     * @param poly2
     *
     * this method will print the product of the two polynomials 
     */
    public static int[] polynomial_multiply(int sizeOfPoly1, int sizeOfPoly2, int[]poly1, int[]poly2){
        int[] product = new int[sizeOfPoly1+sizeOfPoly2-1];
        // Initializing the array
        for (int i = 0; i <sizeOfPoly1+sizeOfPoly2-1 ; i++) {
            product[i] = 0;
        }
        for (int i = 0; i <sizeOfPoly1 ; i++) {
            for (int j = 0; j <sizeOfPoly2 ; j++) {
                product[i+j] += poly1[i]*poly2[j];
            }
        }

        return product;
    }
}