package hashMap;


import java.util.HashMap;
				
public class HashMap2 {

	public static void main(String[] args) {

	HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
	System.out.println(hm);  //{}
	
	hm.put(101, "Rahul");
	hm.put(102, "Priya");
	hm.put(103, "Sonia");
	hm.put(102, "Priyanka");
	
	System.out.println(hm); //{101=Rahul, 102=Priyanka, 103=Sonia}
	
	System.out.println(hm.get(101)); //Rahul
	
	hm.putIfAbsent(104, "Yaaa");
	System.out.println(hm);  // {101=Rahul, 102=Priyanka, 103=Sonia, 104=Yaaa}
	
	//hm.putAll(hm);
	System.out.println(hm);
	
//	put& putIfAbset are like similar to add but putIf key is their is perform otherwise its not
	
	System.out.println(hm.keySet()); //[101, 102, 103, 104]
	
	System.out.println(hm.values()); //[Rahul, Priyanka, Sonia, Yaaa]
	
	System.out.println(hm.containsKey(102));  //True
	System.out.println(hm.containsKey(107));  //False
	
	System.out.println(hm.containsValue("Rahul")); //True
	System.out.println(hm.containsValue("Tamil"));  //False
	
	
	}	

}