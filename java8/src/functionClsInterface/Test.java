package functionClsInterface;


//Normal one 


interface TestI{
		public abstract void login();
}

public class Test implements TestI {	
	
	@Override
	public void login() {
		System.out.println("login Success");
		
	}


	public static void main(String[] args) {

	TestI	t1= new Test();
	
	t1.login();

	}
	
}
