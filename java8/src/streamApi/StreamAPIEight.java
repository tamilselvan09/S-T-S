package streamApi;

import java.util.ArrayList;
import java.util.List;

public class StreamAPIEight {

	
	public static void main(String[] args) {
		List names = new ArrayList();	  //we are not declare anything so we can add int and string
		names.add("Tamil9");
		names.add("Selvna1");
		names.add("Mano3");
		names.add(3);
		names.add("yes");
		
		for(Object name:names){
			System.out.println(name); 
		}

	}
}
