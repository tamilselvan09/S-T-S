package queue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueone5 {

	public static void main(String[] args) {
		PriorityQueue pq=new PriorityQueue();
		
		System.out.println(pq);  //[]
		System.out.println(pq.element());      //There is no read so element create one exception 
		System.out.println(pq.peek());      //Peek return null
		
	}

}
	