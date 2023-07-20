package queue;

import java.util.PriorityQueue;

public class PriorityQueueone3 {

	public static void main(String[] args) {
		PriorityQueue pq=new PriorityQueue();
		
	  pq.add(10);
	  
	  System.out.println(pq);  //[10]
	  
	  System.out.println(pq.offer(20));//true  //offer also same like a update but is update is tell true otherwise null
	  
	  System.out.println(pq);  //[10,20]
	}

}
	