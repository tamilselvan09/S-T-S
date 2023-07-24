package methodSign;

public class TestOne {
	
	  void m1(){
	        System.out.println("method m1- zero argument");
	    }
	    void m1(int a){
	        System.out.println("method m1-  argument - int");
	    }
	    void m1(int a, int b){
	        System.out.println("method m1- Two argument");
	    }
	public static void main(String[] args) {
		TestOne t = new TestOne();
		
		t.m1();
		t.m1(10);
		t.m1(1,2);

	}

}


