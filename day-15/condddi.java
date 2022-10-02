// Java program to find largest among two
// numbers using ternary operator

import java.io.*;

class Ternary2 {
	public static void main(String[] args)
	{

		// variable declaration
		double n1 = -234325.34, n2 = -223434.234, max;

		System.out.println("First num: " + n1);
		System.out.println("Second num: " + n2);

		// Largest among n1 and n2
		max = (n1 > n2) ? n1 : n2;

		// Print the largest number
		System.out.println("Maximum is = " + max);
	}
}
