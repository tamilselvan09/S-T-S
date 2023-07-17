package set;

import java.util.HashSet;

public class HashSetEx1 {

	public static void main(String[] args) {
		HashSet<Integer> hs=new HashSet<Integer>(10,0.80f);
		
		hs.add(10);
		hs.add(20); 
		hs.add(30);
		hs.add(40);
		
		System.out.println(hs);  //[20,40,10,30]
		System.out.println(hs.size());  //4
		System.out.println(hs.isEmpty()); //false
		
		
		
	}

}
	