package equalsvsOpr;

class Emp{
	
}

class User{
	
}

public class Test {

	public static void main(String[] args) {

		 int a = 10;
		 int b = 20;
		 int c = 10;

		 
		 System.out.println(a==b);  //false 
		 System.out.println(a==c);  //true
		 
		 
		 Emp e1 = new Emp();
		 Emp e2 = new Emp();
		 User u1 = new User();
		 
		 
		 System.out.println(e1==e2);  //false
		// System.out.println(e1==u1);  wde cant excicute because emp , user
		 
		 
		 String s1 ="Tamil";
		 String s2 =new String("Tamil");
		 String s3 =new String ("Tamil");
		 
		 System.out.println(s1==s2);  //false
		 System.out.println(s1.equals(e1));  //false
		 System.out.println(s1.equals(s2));  //true
		 System.out.println(s1.equals(s3));  //true
		 
		 
	}

}
