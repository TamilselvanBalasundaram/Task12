package task12;

public class Ques2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("******ArrayIndexOutOfBoundsException******");
		int a[] = new int[6];
		
		try {
			System.out.println(a[6]);
		} catch (Exception e){
			System.out.println(e);
		}
		
		System.out.println();
		System.out.println("*****StringIndexOutOfBoundsException*****");
		String s = "Tamil";
		
		try {
			System.out.println(s.substring(0 , 6));
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
