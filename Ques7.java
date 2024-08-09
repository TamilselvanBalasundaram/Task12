package task12;

import java.util.ArrayList;
import java.util.List;

public class Ques7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  
		List<Object> listobj = new ArrayList<>();

		    listobj.add("Robert");
		    listobj.add("Actor");
		    listobj.add(100000);
		    listobj.add(45);
		    listobj.add(true);
		    
		    System.out.println("Elements in list - " +listobj);

	        Object[] listarr = listobj.toArray();
	        
	        System.out.println();
	        System.out.println("List converted to Array :");
	        for (Object temp : listarr) {
	            System.out.println(temp);
	        }

	}

}
