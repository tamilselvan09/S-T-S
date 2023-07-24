package methodSign;

//Same method TestOne with Static 
//So no need for obj creation

public class TestTwo {
	
	  static void m1(){
	        System.out.println("method m1- zero argument");
	    }
	    static void m1(int a){
	        System.out.println("method m1-  argument - int");
	    }
	    static void m1(int a, int b){
	        System.out.println("method m1- Two argument");
	    }
	public static void main(String[] args) {
		//TestTwo t = new TestTwo();  
		
		m1();
		m1(10);
		m1(1,2);

	}

}


