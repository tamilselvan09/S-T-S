package methodSign;

class Emp{
	
}
//We can't Execute that method because main method has no string
public class Test {
	void m1(String name) {
		System.out.println("String Version");
	}
	void m1(StringBuffer name) {
		System.out.println("StringBuffer Version");
	}
	void m1(Object obj) {
		System.out.println("Object Version");
	}

	public static void main(int[] args) {}
	public static void main(float[] args) {}
	public static void main(Object[] args) {
		
		Test t = new Test();
		t.m1("Tamil");
		t.m1(new StringBuffer("Tamil"));
		t.m1(1000.00);
		t.m1(new Emp());
		
		
	}

}
