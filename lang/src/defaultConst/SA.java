package defaultConst;


class Account{
	 int acc_Id;
	 String acc_Name;
	 Account(int id, String name){
		 this.acc_Id =id;
		 this.acc_Name = name;
	 }
}
public class SA extends Account{
	int acc_Amount;
	SA (int id, String name, int amount){
		super(id, name);
		
		this.acc_Amount = amount;
	}

	public static void main(String[] args) {
		
		   SA a1= new SA(101,"Rahul", 50000);
	       System.out.println(a1.acc_Id);
	       System.out.println(a1.acc_Name);
	       System.out.println(a1.acc_Amount);

	       
	       SA a2 = new SA (102,"Priyanka",100000);
	       System.out.println(a2.acc_Id);
	       System.out.println(a2.acc_Name);
	       System.out.println(a2.acc_Amount);
	}

}
