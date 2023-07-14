package linkedlist;

import java.util.LinkedList;

public class LinkedListTwo {

	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		ll.add(10);
		ll.add(20);
		ll.add(10);
		ll.add("Rahul");
		ll.add(3);
		
		System.out.println(ll);  //[10, 20, 10, Rahul, 3]
		
		//We are redriving method using for each
		
		for(Object value:ll) {
			System.out.println(value);
			
		}

	}

}
