/*Homework week 1
 * Calculate the sum of the first 100 numbers higher than 0 
 * 
 * @author Andreea Sinca
 */
package Algorithms;

import java.util.Scanner;

public class Sum {

	public static int sumFirstNumber(int n) {
		int sum = 0; // initializing with 0, default value if int type
		for (int i = 1; i <= n; i++) {
			sum = sum + i;
		}
		return sum;// return the value of sum
	}
}
