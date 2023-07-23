package objEx;

public class Test {
	
	public String toString() {
		
		//we declare toString so class test extends Object
		
		return"Hello EveryOne";
	}

	public static void main(String[] args) {
	Test t = new Test ();

	System.out.println(t);  //Hello EveryOne
	System.out.println(t.toString());  //Hello EveryOne
	}

}
