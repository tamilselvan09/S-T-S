package functionClsInterface;


//Lambda one 

@FunctionalInterface
interface TestInterface{
		public abstract void login();
}

public class Test2  {	
	
	

	public static void main(String[] args) {

	TestInterface i= ()->{
		System.out.println("Log in");
	};
	i.login();

	}
	
}
