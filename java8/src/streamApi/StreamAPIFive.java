package streamApi;

import java.util.ArrayList;
import java.util.List;

public class StreamAPIFive {

	public static void main(String[] args) {
		List<Integer> marks = new ArrayList<Integer>();	
		marks.add(10);
		marks.add(20);
		marks.add(30);
		marks.add(40);
		marks.add(50);
		marks.add(60);
		for(Integer mark:marks){
			System.out.println(mark+10); 
		}

	}
}
