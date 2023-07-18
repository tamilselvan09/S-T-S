package linkedlist;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListFive {

	public static void main(String[] args) {
		//sort
		//shuffle
		//reverseOrder
		
		LinkedList<String> enames=new LinkedList<String>();
		enames.add("Rahul");
		enames.add("Sonai");
		enames.add("Priyanka");
		enames.add("Modi");
		enames.add("Shaw");
		
		System.out.println(enames); //[Rahul, Sonai, Priyanka, Modi, Shaw]

		enames.addFirst("Tamil");
		enames.addLast("Selvan");
		
		System.out.println(enames); //[Tamil, Rahul, Sonai, Priyanka, Modi, Shaw, Selvan]
		
		Collections.sort(enames);
		
		System.out.println(enames);  //[Modi, Priyanka, Rahul, Selvan, Shaw, Sonai, Tamil]

		Collections.sort(enames,Collections.reverseOrder());
		
		System.out.println(enames);  //[Tamil, Sonai, Shaw, Selvan, Rahul, Priyanka, Modi]
		
		Collections.shuffle(enames);
		
		System.out.println(enames); //shuffle the all method
	}

}
