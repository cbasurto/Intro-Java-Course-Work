//cbasurto: Hw 1 problem 1 defining Date class with toString method.

import java.util.Calendar;

public class Date
{
	//fields
	private int day;
	private int month;
	private int year;

	//constructors
	public Date(){
		day = 23;
		month = 04;
		year = 1991;
	}

	//standard constructor
	public Date (int m, int d, int y){
		day = d;
		month = m;
		year = y;
	}

	public Date(String sdate) {
		String[] strsplit = sdate.split("/");
		day = Integer.parseInt(strsplit[1]);
		month = Integer.parseInt(strsplit[0]);
		year = Integer.parseInt(strsplit[2]);		
	}
	
	//getters
	public int getDay()
	{
		return day;
	}
	public int getMonth()
	{
		return month;
	}
	public int getYear()
	{
		return year;
	}
        //to return today 
	public static Date today(){
		Calendar c = Calendar.getInstance();
		int month = c.get(Calendar.MONTH)+1;
		int day = c.get(Calendar.DAY_OF_MONTH);
		int year = c.get(Calendar.YEAR);

		Date today = new Date(month,day,year);
		return today;
	}
	
	//boolean non-static lessThan method
	public boolean lessThan(Date d){
		if(year < d.getYear())
			return true;
		else if(year > d.getYear())
			return false;
		
		if(month < d.getMonth())
			return true;
		else if(month > d.getMonth())
			return false;
		
		if(day < d.getDay())
			return true;
		else if(day > d.getDay())
			return false;
		
		return false;
	}

	//boolean equal method
	public boolean equals(Date d){
		if(day==d.getDay() && month==d.getMonth() && year==d.getYear())
			return true;
		else
			return false;
	}

	//toString method to return date
	public String toString(){
		return ""+month+" / "+day+" / "+year+"";
	}



}








