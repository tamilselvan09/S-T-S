package predifineFI;

import java.util.function.Predicate;

interface PredicateTen{
	boolean test(String name);
}

public class TestSix implements PredicateTen{
	
	public boolean test(String name) {
		return name.length()>4;
	}

	public static void main(String[] args) {
	
		//PredicateTen t1 = new TestSix(); //Obj creaction and excicute
		
		// PredicateTen t1= name ->name.length()>4; //Normal lambda 
		 
		 Predicate <String> t1 = name -> name.length()>4;
		System.out.println(t1.test("Tamil"));

	}

}
