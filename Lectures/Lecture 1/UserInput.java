package Lecture1;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Summation:"+(a+b)+"\nSubtraction:"+(a-b)+"\nMultiplication:"+(a*b)+"\nDivision:"+(a/b));
	}

}
