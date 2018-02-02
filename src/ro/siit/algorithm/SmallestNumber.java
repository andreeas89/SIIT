/*Homework week 1
 * 
 * display the smallest number from an array of numbers
 * 
 * @author Andreea Sinca
 */
package Algorithms;

public class SmallestNumber {
	public static int smallNumber(int a[]) {
		int min = a[0];// consider the first value like the smallest number for begining

		for (int i = 1; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}
		return min;// return the small number
	}

	public int bigNumber(int a[]) {
		int max = a[0];// consider the first value like the big number for begining

		for (int i = 1; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		return max;// return the big number
	}

}