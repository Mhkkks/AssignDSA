package assignment.numbers;

import java.util.Scanner;

public class CountDigits {

	public static void main(String[] args) {

		System.out.print("Enter your number:");
		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();
		int j = 0;
		for (int i = 1; n / i >= 1; i = i * 10) {
			j++;
		}
		System.out.print("Number of digits in " + n + " is " + j);

		scn.close();
	}

}
