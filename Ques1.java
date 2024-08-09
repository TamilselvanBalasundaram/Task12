package task12;

import java.util.Scanner;

public class Ques1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x;
		int y;
		
		Scanner input = new Scanner(System.in);
		
		try {
			System.out.println("Enter the first integer - ");
			x = input.nextInt();
			
			System.out.println("Enter the second integer - ");
			y = input.nextInt();
			
			int z = x/y;
			System.out.println("Result = " + z);
		}
		
		catch (Exception e) {
			System.out.println(e);
		}

	}

}
