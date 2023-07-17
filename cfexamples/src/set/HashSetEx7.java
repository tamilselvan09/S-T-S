package set;
//Hash Set Operation
   //Union
   //Intersection
    //Difference

import java.util.HashSet;

	
public class HashSetEx7 {

	public static void main(String[] args) {
	
		HashSet <Integer> hs1=new HashSet<Integer>();
		HashSet <Integer> hs2=new HashSet<Integer>();
		
		
		hs1.add(10);
		hs1.add(20);
		hs1.add(30);
		hs1.add(40);
		hs1.add(50);
		hs1.add(60);
		//System.out.println(hs1);
		
		hs2.add(70);
		hs2.add(80);
		hs2.add(90);
		hs2.add(100);
		hs2.add(110);
		hs2.add(120);
		//System.out.println(hs2);
		
		//Union
		
		hs1.addAll(hs2);
		System.out.println(hs1);  //[80, 50, 20, 100, 70, 40, 120, 10, 90, 60, 30, 110]
		
		
		//Intersection
		
		hs1.retainAll(hs2);
		System.out.println(hs1);  //[80, 100, 70, 120, 90, 110]
		
		
		//Difference
		
		
		hs1.removeAll(hs2);
		System.out.println(hs1);  //[]
		System.out.println(hs2);  //[80, 100, 70, 120, 90, 110]
		
		
		
		hs1.containsAll(hs2);
		System.out.println(hs1);  //[]
		
		
		
	}

}
	