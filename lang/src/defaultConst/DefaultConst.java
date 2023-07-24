package defaultConst;

class Parent{
	Parent (String name){
		System.out.println(name);
	}
}
class Child extends Parent{
	Child(String name){
		super(name);
	}
}
public class DefaultConst {

	public static void main(String[] args) {
		new Child("Tamil");

	}

}
