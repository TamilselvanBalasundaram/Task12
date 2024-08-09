package task12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ques4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			FileInputStream obj = new FileInputStream("C:\\Tamil Guvi\\Github\\Project-T\\Basics.txt");
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}
		
		try {
			FileInputStream obj = new FileInputStream("C:\\Tamil Guvi\\Github\\Project-T\\Mains.txt");
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}

	}

}
