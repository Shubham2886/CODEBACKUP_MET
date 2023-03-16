package college;
public class Date{
	private String day;
	private String month;
	private int year;
	public Date(String d, String m, int y){
		day = d;
		month = m;
		year = y;
	
	}
	public Date(){}
	public String getDay(){return day;}
	public void setDay(String d)
	{day = d;}

	public String getMonth(){return month;}
	public void setMonth(String m)
	{month = m;}

	public int getYear(){return year;}
	public void setYear(int y)
	{year = y;}
	


}
