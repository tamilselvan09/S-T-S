package functionClsInterface;


interface Calc {
	public abstract int sum (int a, int b);
}

public class Calclmpl implements Calc{

	public int sum(int a, int b) {
		return a+b;
	}
	public static void main(String[] args) {
	Calc ref = new Calclmpl();
	
	System.out.println(ref.sum(100, -70));
	}

}
