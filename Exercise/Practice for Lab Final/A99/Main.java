package A99;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("num 1: ");
		String input1 = sc.nextLine();
		
		System.out.print("num 2: ");
		String input2 = sc.nextLine();

	
	
	try {
		int num1 = Integer.parseInt(input1);
		int num2 = Integer.parseInt(input2);
		
		int sum = num1+ num2;
		System.out.println(sum);
	}
	catch(NumberFormatException e) {
		
		System.out.print("Hobe nah!");
	}
	
	}
}
