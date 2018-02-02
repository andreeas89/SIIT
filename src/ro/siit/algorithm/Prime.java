/*Homework week 1
 * 
 * display all the prime numbers lower than a given number
 * 
 * @author Andreea Sinca
 */
package Algorithms;

import java.util.Scanner;

public class Prime {
	public static boolean testPrim(int n) {
		if ((n == 0) || (n == 1)) {
			return false;// the first number prime is 2
		}
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
