package arraylistsix;


//add, addAll

//size, isEmpty, contains

import java.util.ArrayList;

public class ArrayListInte2 {
	public static void main (String[] args) {
		
		ArrayList al1=new ArrayList(); //heterogenous data object
		System.out.println(al1.toString());//[]
		al1.add(10);
		al1.add("Rahul");
		al1.add(450000.00);
		System.out.println(al1);
		
		ArrayList<Integer> al2=new ArrayList<Integer>();
		
		al2.add(101);
		al2.add(102);
		al2.add(103);
		al2.add(104);
		//al2.add("ten");  we cant excicte because its string we are declare its int
		
		al1.addAll(al2);
		System.out.println(al1);  //[10, Rahul, 450000.0, 101, 102, 103, 104]
		
		System.out.println(al1.size());  //7
		System.out.println(al1.isEmpty());  //false
		
		//contains means that object is there are not
		System.out.println(al1.contains(105)); // false
		
		//isEmpty(),contains() result is always true,false only.
		
		
	}
}
