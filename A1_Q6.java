package assignment.numbers;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		System.out.print("Enter your number:");
		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();

		while (n > 0) {
			int num = n % 10;
			n = n / 10;
			System.out.print(num);
		}
		scn.close();
	}
}
