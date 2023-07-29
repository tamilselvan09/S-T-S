package optional;

import java.util.ArrayList;
import java.util.Optional;

public class OptionalFour {

	public static void main(String[] args) {
		
		ArrayList <String> enames = new ArrayList<String>();
		enames.add("Rahul");
		enames.add(null);
		enames.add("Sonia");
		for(String ename:enames) {
			Optional<String> op = Optional.ofNullable(ename);
			if(op.isEmpty()) {  //is empty always return boolean value
				System.out.println(" Null");
			}
			else {

			System.out.println(op.get().toUpperCase());

		}
		}
		
		
	}
}
