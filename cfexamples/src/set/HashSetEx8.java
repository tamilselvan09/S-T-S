package set;

   //Union
   //Intersection
    //Difference

import java.util.HashSet;

	
public class HashSetEx8 {

	public static void main(String[] args) {
	
		HashSet<Integer> num = new HashSet<Integer>();
	
		num.add(2);
		num.add(4);
		num.add(6);
		num.add(8);
		num.add(10);
		
		HashSet<Integer> odd_num = new HashSet<Integer>();
		odd_num.add(1);
		odd_num.add(3);
		odd_num.add(5);
		odd_num.add(7);
		odd_num.add(9);
		
		num.addAll(odd_num);
		System.out.println(num);  //[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
		System.out.println(odd_num); //[1,3,5,7,9]
		
		odd_num.retainAll(num);
		System.out.println(odd_num); //[1, 3, 5, 7, 9]
		System.out.println(num);   //[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
		
	}

}
	