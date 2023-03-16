namespace Met.Payroll;

public class PartTimeStaff : Staff
{
    public int NumberOfHours { get; set; }
    public double RatePerHour { get; set; }

    public PartTimeStaff(string name, string address, int hours = 180, double rate = 200)
    {
        Name = name;
        Address = address;
        NumberOfHours = hours;
        RatePerHour = rate;
    }

}