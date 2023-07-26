package dateandTime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class TimeZoneConv {

	public static void main(String[] args) {
	//Today date
		Date today= new Date();
		
	//IST timeZone
		DateFormat df = new SimpleDateFormat("dd-mm-yy HH:MM:SS z");
	
		df.setTimeZone(TimeZone.getTimeZone("Asia/Kolkata"));
		String IST = df.format(today);
		System.out.println("Date in Indian TimeZone (IST) : " + IST);
		//22:07:194 IST
		//GMT Time Zone
		df.setTimeZone(TimeZone.getTimeZone("England/London"));
		String GMT = df.format(today);
		System.out.println("Date in England TimeZone (GMT) : " + GMT);
		//17:07:251 GMT
		
		
	}

}
