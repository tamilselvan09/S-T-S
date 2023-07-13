package ArrayListThree;

import java.util.ArrayList;

public class ArrayListForEach {

	public static void main(String[] args) {
		
		ArrayList<String> enames=new ArrayList<String>();
		
		
		enames.add("Tamil");
		enames.add("Selvan");
		enames.add("Logan");
		enames.add("Kumar");
		enames.add("Erwin");
		
		for(String ename:enames) {
			System.out.println(ename);
		
		}
		}
		

	}


