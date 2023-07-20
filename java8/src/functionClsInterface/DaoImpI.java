package functionClsInterface;

@FunctionalInterface
interface DaoInterface{
	public abstract void login();
	//logout();  one abstract method only allowed 
}

public class DaoImpI implements DaoInterface{

	@Override
	public void login() {
		System.out.println("Login Successfull");
		
	}
	public static void main(String[] args) {
		//DaoImpl dao = new DaoImpl();
		//dao.login();
	}
	
	
}
