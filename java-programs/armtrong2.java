/**
 * 
 */
package com.ericsson.Test1;

/**
 * @author nayak
 *
 */
public class ArmstrongNumberr {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		System.out.println(numberOfDigits(20));
		System.out.println(armstrongOrNot(1634));

	}
	
	public static boolean armstrongOrNot(int n) {
		if (n == 1 || n == 0) {
			return true;
		}
		 int num = numberOfDigits(n);
		 
		 int sum_of_cubes = 0;
	        int q;
	        q = n;
	        
	        while(q>0) {
	        	sum_of_cubes += Math.pow((q%10), num);
	        	q = Math.floorDiv(q, 10);
	        }
	        
	        if(sum_of_cubes==n) {
	        	return true;
	        }
		
		
		return false;
	}
	
	static int  numberOfDigits(int n) {
		int c = 0;
	      int q = n;
	      while (q > 0) { 
	        q = Math.floorDiv(q, 10);
	        c++;
	      }
	      return c;
	}

}
