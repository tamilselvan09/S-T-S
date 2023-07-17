package set;

import java.util.HashSet;

public class HashSetEx {

	public static void main(String[] args) {
		HashSet<Integer> hs=new HashSet<Integer>(10,0.80f);
		
		hs.add(10);
		hs.add(20);
	//	hs.add("Rahul");  //We mention integer but we right string so its not 
		hs.add(30);
		hs.add(40);
		
		System.out.println(hs);  //[20,40,10,30]
		
		
		//Intexing consept is not there so we get value in random way
	}

}
	