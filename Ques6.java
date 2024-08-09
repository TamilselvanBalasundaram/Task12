package task12;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Ques6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		Map<Integer, String> mapobj = new TreeMap<Integer, String>();

        mapobj.put(200, "Vikram");
        mapobj.put(201, "Karthi");
        mapobj.put(202, "Ajith");
        mapobj.put(203, "William");
        mapobj.put(204, "Tamil"); 
        mapobj.put(205, "Bala");
        mapobj.put(206, "Selvan");
        mapobj.put(207, "Naren");
        mapobj.put(208, "Anirudh");
        mapobj.put(209, "Yuvan");
        
        System.out.println("Employee ID - Employee Name");
        
    	for (Entry<Integer, String> temp : mapobj.entrySet()) {
			System.out.println(temp);
    	}
    	System.out.println();
    	
    	System.out.println("Employee Names in Alphabetical Order :");
    	
    	mapobj.values().stream().sorted().forEach(System.out::println);

	}

}
	
