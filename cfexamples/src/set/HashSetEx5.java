package set;

import java.util.HashSet;
import java.util.Iterator;
	
public class HashSetEx5 {

	public static void main(String[] args) {
		HashSet<Integer> hs=new HashSet<Integer>(10,0.80f);
		
		hs.add(10);
		hs.add(20);
	//	hs.add("Rahul");  //We mention integer but we right string so its not 
		hs.add(30);
		hs.add(40);
			
		System.out.println(hs);  //[20,40,10,30]
		
		//Intexing consecpt is not there so we cant use normal loop 
		//Iterrater only for each and iterrator method
		
		//iterator
		
		 Iterator i= hs.iterator();
		 while(i.hasNext()) {
			 System.out.println(i.next());  //20,40,10,30
		 }
		
		
		
	}

}
	