package set;

import java.util.HashSet;
import java.util.Iterator;
	
public class HashSetEx5 {

	public static void main(String[] args) {
		
	HashSet	hs=new HashSet();
	   //duplicates are not allowed
	  // so only one 10 will print
	
	hs.add(10);
	hs.add(10);
	hs.add(10);
	hs.add(10);
	hs.add(10);
	hs.add(10);
	hs.add(10);
	hs.add(10);
	hs.add(10);
	hs.add(10);
	
	hs.add("Tamil");
	hs.add(null);
	hs.add(true);
	hs.add(11);
	
	
	System.out.println(hs);  // [null, 10, 11, Tamil, true]
	
		for(Object obj:hs) {
			System.out.println(obj);
		}
	}

}
	