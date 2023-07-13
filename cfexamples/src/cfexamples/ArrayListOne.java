package cfexamples;



import java.util.ArrayList;
import java.util.List;

public class ArrayListOne {

	public static void main(String[] args) {
		
		
			ArrayList al=new ArrayList();
			System.out.println(al);//[]
			al.add(10);
			al.add("Rahul");
			al.add(10);
			al.add(null);
			System.out.println(al);  //[10, Rahul, 10, null]
			System.out.println(al.get(0));//10
			

		}

	}


