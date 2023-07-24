package equalvsEquals;

class Emp1{
	
}

public class TestTwo {

	public static void main(String[] args) {
		Emp e1 = new Emp();
		Emp e2 = new Emp();

		System.out.println(e1 == e2);   //false
		System.out.println(e1.equals(e2));  //false
	}

}
