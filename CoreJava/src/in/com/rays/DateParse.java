package in.com.rays;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateParse {
	public static void main(String[] args) throws ParseException {
		//Date d=new Date()
		String s= "12/01/1024";
		SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
		Date d= sdf.parse(s);
		System.out.println(d);
	}
		
   
	
    
		
}
