package linkedlist;


import java.util.LinkedList;

public class LinkedListOne {

	public static void main(String[] args) {
		
		LinkedList<String> enames=new LinkedList<String>();
		enames.add("Rahul");
		enames.add("Sonai");
		enames.add("Priyanka");
		enames.add("Modi");
		enames.add("Shaw");
		
		
		System.out.println(enames);  //[Rahul, Sonai, Priyanka, Modi, Shaw]
		
		enames.addFirst("Tamil");
		System.out.println(enames);  //[Tamil, Rahul, Sonai, Priyanka, Modi, Shaw]
		
		enames.addLast("Selvan");
		System.out.println(enames);  //[Tamil, Rahul, Sonai, Priyanka, Modi, Shaw, Selvan]
	}

}
