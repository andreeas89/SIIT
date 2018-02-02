/*Homework week 1
 * 
 * display the max digit from a number
 *  
 * @author Andreea Sinca
 */
package Algorithms;

import java.util.Scanner;

public class MaxDigit {

	public int maxDigit(int n) {
		int max = 0;// initializing the value by 0
		while (n != 0) {
			int lastNum = n % 10;// the last value from the number
			if (lastNum > max) {
				max = lastNum;// reinitializing with the new big digit
			}
			n = n / 10;
		}
		return max;// return the max digit
	}
}
