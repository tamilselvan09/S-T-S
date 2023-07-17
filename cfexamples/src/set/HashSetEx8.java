package set;
//Hash Set Operation
   //Union
   //Intersection
    //Difference

import java.util.HashSet;

	
public class HashSetEx8 {

	public static void main(String[] args) {
	
		HashSet <Integer> hs1=new HashSet<Integer>();
		HashSet <Integer> hs2=new HashSet<Integer>();
		
		hs1.add(10);
		hs1.add(20);
		hs1.add(30);
		hs1.add(40);
		
		
		hs2.add(30);
		hs2.add(40);
		hs2.add(50);
		hs2.add(60);
		
		
		hs1.addAll(hs2);
		System.out.println(hs1);
	}

}
	