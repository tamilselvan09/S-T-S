package hashMap;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

				
public class HashMap3 {

	public static void main(String[] args) {
		 HashMap<Integer, String> hs=new HashMap<Integer, String>();

		 hs.put(101, "Rahul");
	     hs.put(102, "Sonia");
		 hs.put(103, "Priyanka");
		 hs.put(104, "Modi");
		 
		 System.out.println(hs); //{101=Rahul, 102=Sonia, 103=Priyanka, 104=Modi}
		 
		 //Iterating for each method
		 
		 for(Object keyset:hs.keySet()) {
			 System.out.println(keyset);
		 }  //101,102,103,104
		 
		 for(Object value:hs.values()) {
			 System.out.println(value);
		 }  //Rahul,Sonia,Priyanka,Modi
		 
		 for(Object entry:hs.entrySet()) {
			 System.out.println(entry);
		 }  //101=Rahul,102=Sonia,103=Priyanka,104=Modi
		 
		 
		 Iterator i = hs.entrySet().iterator();
		 while(i.hasNext()) {
			Entry x =(Entry)i.next();
	//	  System.out.println( x.getKey() + ":" + x.getValue());
		 }
		 
		 
	}	

}