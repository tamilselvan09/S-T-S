package set;
//Hash Set Operation
   //Union
   //Intersection
    //Difference

import java.util.HashSet;

	
public class HashSetEx9 {

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
		
		//Union
		hs1.addAll(hs2);
		System.out.println(hs1); //[50, 20, 40, 10, 60, 30]
		
		//Intersection
		hs1.retainAll(hs2);
		System.out.println(hs1);  //[50, 40, 60, 30]
		
		//Difference
		hs1.remove(hs2);
		System.out.println(hs1);  //[50, 40, 60, 30]
		
		
		
	}

}
	