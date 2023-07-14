package arraylistsix;

import java.util.ArrayList;

public class ArrayListInteger {

	public static void main(String[] args) {
		
		ArrayList al1=new ArrayList();
		System.out.println(al1.toString()); //[]
		al1.add(10);
		al1.add("Rahul");
		al1.add(4500.00);
		al1.add(10);
		System.out.println(al1);  //[10, Rahul, 4500.0, 10]
		
		
	}

	

}
