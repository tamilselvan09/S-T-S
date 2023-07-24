package defaultConst;

 class A extends Object{
	int Acc_Amount;
	
	
}

class B extends A{
	B(int amount){
		super();
	}
}
public class Test {

	public static void main(String[] args) {
		B obj = new B(100);
		
		System.out.println(obj.Acc_Amount);

	}

}
