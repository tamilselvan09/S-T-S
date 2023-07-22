package predifineFI;


interface TestI{
	public abstract boolean test(int A);
}
public class TestThree {
	// static TestI i = (int A)->{return A<100; };  lessthen
	public static void main(String[] args) {
		
	TestI	i= a ->a>100;  //Greaterthan 
		
		System.out.println(i.test(99));
		

	}

}
