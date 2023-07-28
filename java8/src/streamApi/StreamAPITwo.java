package streamApi;

import java.util.stream.Stream;

public class StreamAPITwo {

	public static void main(String[] args) {
		int [] marks = {100,90,80,70};
		for (int mark:marks) {
			System.out.println(mark+10);  //110,100,90,80
		}

	}
}
