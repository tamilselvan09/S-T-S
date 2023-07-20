package queue;

import java.util.PriorityQueue;

public class PriorityQueueone2 {

	public static void main(String[] args) {
		PriorityQueue pq=new PriorityQueue();
		
	    pq.add("A");
	    pq.add("B");
	    pq.add("C");
	    pq.add("D");
	   	pq.add("E");
	 	pq.add("F");
	    						
	 	System.out.println(pq);
	 	
	 	pq.remove();  //A is removing 
	 	
		System.out.println(pq);  //[B, D, C, F, E]
		//pq.remove();
		
		System.out.println(pq.element()); //B
	}

}
	