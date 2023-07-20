package queue;

import java.util.PriorityQueue;

public class PriorityQueueone {

	public static void main(String[] args) {
		PriorityQueue pq=new PriorityQueue();
		
		System.out.println(pq);  //[]
		
		//pq.add(100);  We can't add normal integer, only String method only allowed
		pq.add("rahul@gmail.com");
		pq.add("sonia@gmail.com");
		pq.add("priya@gmail.com");
		pq.add("modi@gmail.com");
		pq.add("200");
		pq.add("100");
		
		
		
		System.out.println(pq);
	}

}
	