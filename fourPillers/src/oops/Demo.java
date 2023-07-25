package oops;

public class Demo {

	public static void main(String[] args) {
		SA a1 = new SA();
		
		a1.setAcc_Id(100);
		a1.setAcc_Name("Tamil");
		a1.setAcc_Bal(30000.00);
		a1.setMin_Bal(1000.00);
		//Calculate balance
		a1.cal_bal();  //acc_bal-min_bal=29000
		
		System.out.println("Account Holder Name :"+ a1.getAcc_Name());  //Account Holder Name :Tamil
		System.out.println("Account  Balance :"+ a1.getAcc_Bal());  //Account  Balance :30000.0
		
		AccountService.accountinfo(a1);
		
		
		CA a2 = new CA();
		
		a2.setAcc_Id(200);
		a2.setAcc_Name("Selvi");
		a2.setAcc_Bal(30000.00);
		a2.setMin_Bal(1000.00);
		//Calculate balance
		a2.cal_Bal();  //acc_bal-min_bal=29000
		
		System.out.println("Account Holder Name :"+ a2.getAcc_Name());  //Account Holder Name :Selvi
		System.out.println("Account  Balance :"+ a2.getAcc_Bal());  //Account  Balance :30000.0
		
		AccountService.accountinfo(a1);

	}

}
