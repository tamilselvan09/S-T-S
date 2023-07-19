package hashMap;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

				
public class HashMap4 {

	public static void main(String[] args) {
		 HashMap<Integer, String> hs=new HashMap<Integer, String>();

		 hs.put(101, "Rahul");
	     hs.put(102, "Sonia");
		 hs.put(103, "Priyanka");
		 hs.put(104, "Modi");
		 
	   System.out.println(hs);
	   
	   hs.remove(102);
	   
	   System.out.println(hs);
		 
		 
	}	

}