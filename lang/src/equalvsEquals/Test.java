package equalvsEquals;

public class Test {

	public static void main(String[] args) {
		String s1 = new String ("Tamil");
		String s2 = new String ("Tamil");
		String s3 = new String ("Slvan");
		String s4 = "Selvan";
		
		
		
		// == operator compares the data for primitive data types and addresses for objects
		//Its only check memory  location
		System.out.println(s1==s2);  //False
		System.out.println(s1==s3);  //False
		System.out.println(s1==s4);  //False
		System.out.println(s4);  //Selvan
		
		
		
		
		// Equals Because its only comparing the values given 
		System .out.println(s1.equals(s2));  //true
		System .out.println(s1.equals(s3));  //false 
		System .out.println(s1.equals(s4));  //false
		

	}

}
