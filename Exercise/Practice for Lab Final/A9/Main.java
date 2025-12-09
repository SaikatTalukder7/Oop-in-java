package A9;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");

		String text = sc.nextLine();
    	System.out.print("Enter an index: ");

		int index = sc.nextInt();
		
		Exception e = new Exception();
		String result = e.getPosition(text, index);
		
		System.out.println(result);
		
		sc.close();
	}

}
