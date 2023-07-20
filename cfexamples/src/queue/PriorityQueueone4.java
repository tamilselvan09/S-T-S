package queue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueone4 {

	public static void main(String[] args) {
		PriorityQueue names=new PriorityQueue();
		
		
		names.add("Rahul");
		names.add("Sonai");
		names.add("Priyanka");
		names.add("Modi");
		names.add("Madhu");
		
		//for each
		for(Object name:names) {
				System.out.println(name);
		}
		
		//Iterator
		Iterator itr=names.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	 
	}

}
	