package lambda;

interface Interface1{
	void display();
}

public class Ex {

	public static void main(String[] args) {
		Interface1 i = ()->{System.out.println("Hello,Bye");};
		i.display();
	}
}