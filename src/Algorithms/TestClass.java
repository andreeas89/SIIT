/**
 * 1. Calculate the sum of the first 100 numbers higher than 0

2. Display the smallest number from an array of number

3. Display the max digit from a number.

4. Check if a number is palindrom( e.g palindrom 1221, 34143)

5. Display all the prime numbers lower than a given number
 * @author Andreea
 */
package Algorithms;

import java.util.Scanner;

public class TestClass {
	public static void main(String[] args) {
		int a [] = {21,5,7,32,65,25,87,41,6,8,31,21};//initializing the value of array
		
		Scanner sr = new Scanner(System.in);
		System.out.println("The number is ");
		int n = sr.nextInt();// introduce the number from keyboards
		
		//the sum of the first 100 numbers higher than 0
		System.out.println("The sum of number = " + Sum.sumFirstNumber(n));

		//the max digit from a number
		MaxDigit obj = new MaxDigit();// create an object of type ToCalculate
		System.out.println("The max digit from a number is = " + obj.maxDigit(n));// write the max digit from the number

		//Check if a number is palindrom
		Palindrom.palindrom(n); // call the method palindrom(n);

		//the prime numbers lower than a given number
		for (int i = 0; i < n; i++) {
			if (Prime.testPrim(i) == true) {// test if the number is prim
				System.out.print(i + " .. ");
			}
		}
		System.out.println();
		
		//the small number, it is a static method, and we use the name of the class
		System.out.println("The smallest number from an array is = "+SmallestNumber.smallNumber(a));
				
		//the big number from array, it is NOT a static method, it is necessary to create an object
		SmallestNumber obj2 = new SmallestNumber();
		System.out.println("The big number from an array is= "+obj2.bigNumber(a));
	}
}
