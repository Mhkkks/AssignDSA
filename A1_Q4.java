package assignment.numbers;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		if (n < 3 && n >= 0) {
			System.out.print("Prime");

		} else
			for (int i = 2; i < n; i++) {
				if (n % i == 0) {
					System.out.print("not prime");
					return;
				}
			}
		{
			System.out.print("prime");
		}

		scn.close();
	}

}
