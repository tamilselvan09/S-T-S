package langEx;

public class WrapperOne {

	public static void main(String[] args) {
		
		//Auto- boxing and Un-boxing Consecpt
		
		//Declare a=10, i1=a & b=i1 that mean all are getting same value because of audo & un boxing consecpt 
		
		int a = 10;
		Integer i1 = a;
		
		int b = i1;
		
		System.out.println(a);   //10
		System.out.println(i1);  //10
		System.out.println(b);   //10

	}

}
