package ImpPrograms;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class FindDateDiff {
	
	public static void main (String[] args){

		//method 1
		LocalDate now = LocalDate.now();
		LocalDate otherDate = LocalDate.of(2019, 10, 30);
		int days=Period.between(now, otherDate).getDays(); //this compares and subtracts only days value 
		System.out.println(days);
		System.out.println(ChronoUnit.DAYS.between(otherDate, now)); //Chronounit consider the entire year month day while subtraction

	
		//method2
		
		Date dt= new Date();
		Calendar cal= Calendar.getInstance();
		cal.set(2019,9,30); // 9 is for October - starts wth index 0 i.e for Jan 0, feb 1, etc... 
		Date otherDate1= cal.getTime();
		
		System.out.println(Math.abs((dt.getTime() - otherDate1.getTime())/86400000));
		
		FindDateDiff obj = new FindDateDiff();
		
		System.out.println(obj.dateDiff(dt, otherDate1));
	}
	
	public long dateDiff(Date dt1, Date dt2){
		
		long days = (dt1.getTime() - dt2.getTime())/86400000; // 86400000 is the number of milli seconds
		return Math.abs(days);
		
	} 

}
