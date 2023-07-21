package functionClsInterface;


@FunctionalInterface  //That mean we can only use one Abstract method
interface CalcInterface{
	int sum(int a, int b);
}

public class CalclmplOne {
	
	public static void main(String[] args) {
		
		//Lambda
		
		CalcInterface obj = (a,b)-> a+b;
		System.out.println(obj.sum(10, 20));
	}

}
