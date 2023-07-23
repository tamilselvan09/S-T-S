package lang;

public class Account {
	private int acc_Id;
	private String acc_Name;
	
	//Generate getter and setter 
	
	
	//Over riding te obj clas tostring method
	
	public int getAcc_Id() {
		return acc_Id;
	}
	

	
	@Override
	public String toString() {
		return "Account [getAcc_Id()=" + getAcc_Id() + ", getAcc_Name()=" + getAcc_Name() + "]";
	}



	public void setAcc_Id(int acc_Id) {
		this.acc_Id = acc_Id;
	}
	public String getAcc_Name() {
		return acc_Name;
	}
	public void setAcc_Name(String acc_Name) {
		this.acc_Name = acc_Name;
	}
	
	
	public static void main(String[] args) {
		Account a1 = new Account();
		
		a1.setAcc_Id(100);
		a1.setAcc_Name("Tamil");
		
		System.out.println(a1.toString());
		System.out.println(a1.getAcc_Id());
		System.out.println(a1.getAcc_Name());
		
	}
	
	
	
	
	
	
}
