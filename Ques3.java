package task12;

public class Ques3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ques3 obj = new Ques3();
		
		try {
			obj.agesection(15);
		} catch (Ques3a e) {
			System.out.println(e);
		}

	}
	
	public void agesection (int age) throws Ques3a{
		if (age > 60) {
			System.out.println("Senior Citizen");
		} else if (age > 35) {
			System.out.println("Adult");
		} else if (age > 18) {
			System.out.println("New Adult");
		} else {
			throw new Ques3a ("Invalid Age Exception");
		}
		
	}

}
