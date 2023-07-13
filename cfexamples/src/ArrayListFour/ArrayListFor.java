package ArrayListFour;

import java.util.ArrayList;

public class ArrayListFor {

	public static void main(String[] args) {
		
		ArrayList<String> enames=new ArrayList<String>();
		
		enames.add("Tamil");
		enames.add("Selvan");
		enames.add("Msd");
		enames.add("Jay");
		enames.add("Lokesh");
		
		for(int i=0;i<=enames.size()-1; i++) {
			System.out.println(enames.get(i));
		}
	}
}
