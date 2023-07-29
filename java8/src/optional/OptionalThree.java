package optional;

import java.util.ArrayList;
import java.util.Optional;

public class OptionalThree {

	public static void main(String[] args) {
		//Normal level Optional 
		
		String ename = "Rahul";
		//String ename = null;
		
		System.out.println(ename.length());  //lang.NullPointerException
		
		Optional<String> op = Optional.ofNullable(ename);
		
		if(op.isEmpty()) {  //is empty always return boolean value
			System.out.println(op.get().toUpperCase());
		}
		else {

		
		System.out.println("Value Null");
	}
		
	}
}
