package task12;

import java.util.ArrayList;

public class Ques5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> obj = new ArrayList<String>();
		
		obj.add("Cars");
		obj.add("Animals");
		obj.add("Birds");
		obj.add("Human");
		obj.add("Monuments");
		obj.add("Theatre");
		
		System.out.println("Array list before removal - " + obj);
		
		obj.removeAll(obj);
		
		System.out.println("Array list after removal - " + obj);
	}

}
