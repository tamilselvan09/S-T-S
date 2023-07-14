package ArrayListFive;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class DataOperaction {



	public static void main(String[] args) {
		
		ArrayList<String> enames=new ArrayList<String>();
		
		enames.add("Vignesh");
		enames.add("Mano");
		enames.add("Naveen");
		enames.add("Vasu");
		enames.add("Praveen");
		enames.add("Sumanth");
		enames.add("AB");
		
		
		System.out.println(enames); //[Vignesh, Mano, Naveen, Vasu, Praveen, Sumanth, AB]
		
		//sort mean AtoZ , 1to9 in order
		Collections.sort(enames);
		System.out.println(enames);  //[AB, Mano, Naveen, Praveen, Sumanth, Vasu, Vignesh]
		
		//reverse order ZtoA , 9t01
		Collections.sort(enames,Collections.reverseOrder()); 
		System.out.println(enames);   //[Vignesh, Vasu, Sumanth, Praveen, Naveen, Mano, AB]
		
		//Every time is showing diffrent 
		System.out.println(enames);  //before shuffle
		Collections.shuffle(enames);
		System.out.println(enames);  //After shuffle
		
		
		
		
	}

}
