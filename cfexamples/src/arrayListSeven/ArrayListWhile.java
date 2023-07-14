package arrayListSeven;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListWhile {

	public static void main(String[] args) {
		
		ArrayList<String> enames=new ArrayList<String>();
		
		enames.add("Vignesh");
		enames.add("Mano");
		enames.add("Naveen");
		enames.add("Vasu");
		enames.add("Praveen");
		enames.add("Sumanth");
		
		Iterator itr=enames.iterator();
		System.out.print(itr.hasNext()); //true
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
	}
	}

}
