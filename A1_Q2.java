package assignment.numbers;

import java.util.Scanner;

public class Grading {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
       

		int Marks = scn.nextInt();

		if (Marks > 90) {
			System.out.print("Excellent");
		} else if (Marks > 80) {
			System.out.print("good");
		} else if (Marks > 70) {
			System.out.print("fair");
		} else if (Marks > 60) {
			System.out.print("meets expectations");
		} else {
			System.out.print("below par");
		}
		scn.close();
	}
	
}
