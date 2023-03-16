
public class Date 
{
    public Date(string day , string month, string year)
    {
        Day = day;
        Month = month;
        Year = year;
        
    }
    public static string Day { get; set; }

    public static string Month {get; set;}

    public static string Year { get; set; }

    public static Date ParseDate (string dob)
    {
        string[] DateOfBirth = dob.Split('/');
        Day = DateOfBirth[0];
        Month = DateOfBirth[1];
        Year = DateOfBirth[2];
         var x = new Date(Day, Month, Year);
        return x;
    }
 
}