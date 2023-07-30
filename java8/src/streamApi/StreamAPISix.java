package streamApi;

import java.util.ArrayList;
import java.util.List;

public class StreamAPISix {

	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();	
		names.add("Tamil");
		names.add("Selvna");
		names.add("Mano");
		names.add(null);
		
		for(String name:names){
			System.out.println(name+"Stream"); 
		}

	}
}
