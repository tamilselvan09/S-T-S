package streamApi;

import java.util.stream.Stream;

public class StreamAPIThree {
//Upper case
	public static void main(String[] args) {
		String [] names = {"Tamil","Selvan","Suresh","Sathis","Srikant"};
		for (String name:names) {
			System.out.println(name.toUpperCase()); 
		}

	}
}
