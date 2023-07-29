package optional;

import java.util.ArrayList;

public class Optionalone {

	public static void main(String[] args) {
		//Collection level Optional 
		ArrayList<String> al=new ArrayList<String>();
		
		al.add("Rahul");
		al.add("Priya");
		al.add("Sonia");
		al.add(null);
		//We create Exception using null
		
		String ename = null;
		System.out.println(al);
		//System.out.println(ename.length());
		
		for(String ele:al) {
			System.out.println(ele.toUpperCase());
			System.out.println(ele.toLowerCase());
		}
		

	}

}
