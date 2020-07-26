package assignment_6;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;
public class AgeCalculator1 {
	public void calculateAge(String dob) throws ParseException
	{
		SimpleDateFormat df=new SimpleDateFormat("dd/MM/yyyy");
		Date d=df.parse(dob);
		Calendar cl= Calendar.getInstance();
		cl.setTime(d);
		int date=cl.get(Calendar.DATE);
		int month=cl.get(Calendar.MONTH)+1;
		int year=cl.get(Calendar.YEAR);
		LocalDate now =LocalDate.now();
		LocalDate ld=LocalDate.of(year, month, date);
		Period diff=Period.between(ld, now);
		System.out.println("age:"+diff.getYears()+"Years");
}}
