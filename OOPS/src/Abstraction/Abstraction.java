package Abstraction;

abstract class Dao{
	static int status = 100;
}

class DaoChild extends Dao{
	
}
class AbstractVar{
	public static void main(String[] args) {
		System.out.println(DaoChild.status);
		new DaoChild();
		
	}
}
