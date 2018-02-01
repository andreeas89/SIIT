/*Homework week 1
 * 
 * check if a number is palindrom
 * 
 * @author Andreea Sinca
 */
package Algorithms;

import java.util.*;

public class Palindrom {

	public static void palindrom(int n) {
		int nr = n;// withhold the initial value of n
		int r = 0;// initializing with 0 the value of rest

		while (n != 0) {
			r = r * 10 + n % 10;// we form the new number as the inverse of n
			n = n / 10;
		}

		if (r == nr) {
			System.out.println("The number is palindrom");
		} else {
			System.out.println("The number is NOT palindrom");
		}
	}
}