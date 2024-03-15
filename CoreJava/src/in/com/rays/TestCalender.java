package in.com.rays;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestCalender {
	public static void main(String[] args) throws ParseException {
		String s="13/01/2024";
		SimpleDateFormat sdf= new  SimpleDateFormat("dd/MM/yyyy");
		Date d= sdf.parse(s);
	    Calendar c= Calendar.getInstance();
	    
	    c.setTime(d);
	    for(int i=0; i<6; i++) {
	    	c.add(Calendar.DATE,31);
	    	System.out.println( c.getTime());
	    	
	    }
	    
		
	}

}
