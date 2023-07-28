package streamApi;

import java.util.stream.Stream;

public class StreamAPIOne {

	public static void main(String[] args) {
		Stream<Integer> s = Stream.of(10,20,30);
		s.map(ele->ele+1).forEach(value->System.out.println(value));
        //11,21,31
	}

}
