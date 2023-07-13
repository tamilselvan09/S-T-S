package ArrayListename;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

//Delete Operation

public class ArrayListTwo {

	public static void main(String[] args) {

         ArrayList<String>enames=new ArrayList<String>();
         
         enames.add("Sachin");
         enames.add("Dhoni");
         enames.add("Ghily");
         enames.add("Ab");
         enames.add("Tamim");
         enames.add("Faf");
         
         System.out.println(enames); //[Sachin, Dhoni, Ghily, Ab, Tamim, Faf]
         
//Removes the element at the specified position in this list
         
         enames.remove("Ab");
         
         System.out.println(enames); //[Sachin, Dhoni, Ghily, Tamim, Faf]
         
         enames.remove(2);  //remove using intexing consecpt
         System.out.println(enames);  //[Sachin, Dhoni, Tamim, Faf]
         //Removes all of the elements from this list.
         enames.clear();
         System.out.println(enames);  //[]

	}

}
