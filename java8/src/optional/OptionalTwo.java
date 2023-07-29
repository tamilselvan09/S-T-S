package optional;

import java.util.ArrayList;

public class OptionalTwo {

	public static void main(String[] args) {
		//Collection level Optioonal 
		ArrayList<String> enames=new ArrayList<String>();
		
		enames.add("Rahul");
		enames.add("Priya");
	//	enames.add(null);  After null we cant excicute because that time exception create
		enames.add("Sonia");
		enames.add(null);
		
		
		for(String ename:enames) {
			System.out.println(ename.toUpperCase());
			//System.out.println(ele.toLowerCase());
		}
		

	}

}
