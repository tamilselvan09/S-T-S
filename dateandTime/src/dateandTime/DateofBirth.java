package dateandTime;
//26\07\2023
import java.time.LocalDate;
import java.time.Period;

public class DateofBirth {

	public static void main(String[] args) {
		//DOB
		LocalDate dob= LocalDate.of(1999, 11, 07);
		//CurrentDate
		LocalDate currentDate = LocalDate.now();
		
		//Calculate the difference between thess two 
		Period period= Period.between(dob, currentDate);
		
		
		//Print Difference in years 
		System.out.println(period.getYears()); //23 Years
		//Print in months
		System.out.println(period.getMonths()); //8 Months
		//print days
		System.out.println(period.getDays());  //19 Days
		//All in one
		System.out.printf("Your Age is %d years %d months & %d days.",period.getYears(),period.getMonths(),period.getDays());
		//Your Age is 23 years 8 months & 19 days.
		
	}

}
//Why we are write println to printf

//A convenience method to write a formatted string to this output streamusing the specified format string and arguments. 

//An invocation of this method of the form out.printf(format, args) behavesin exactly the same way as the invocation 
