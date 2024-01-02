package assignment.numbers;

import java.util.Scanner;

public class PrimeN {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();

		Mehak: for (int j = 3; j <= n; j++)

		{
			for (int i = 2; i < j; i++) {
				if (j % i == 0) {
					// System.out.print("not prime");
					continue Mehak;
				}
			}
			{
				System.out.println(j + " is prime");

			}
		}

		scn.close();
	}

}
