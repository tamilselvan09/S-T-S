package arrayListExOne;

import java.util.ArrayList;

public class ArrayListString {

	public static void main(String[] args) {

          ArrayList<String>al1= new ArrayList<String>();
          
          al1.add("Tamil");
          al1.add("Selvan");
          al1.add("Vijay");
          al1.add("Nayan");
          
          System.out.println(al1);  //[Tamil, Selvan, Vijay, Nayan]

          //getting the value
          System.out.println(al1.get(0));  //Tamil
          
          
          //seting the value
          al1.set(0, "Tamim");
          System.out.println(al1);  //[Tamim, Selvan, Vijay, Nayan]
	}

}
