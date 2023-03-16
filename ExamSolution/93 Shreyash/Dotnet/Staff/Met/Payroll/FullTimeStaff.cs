namespace Met.Payroll;

public class FullTimeStaff : Staff
{
    public string Department { get; set; }

    public decimal Salary { get; set; }

    public FullTimeStaff(string name, string address, string dept, decimal sal)
    {
        Name = name;
        Address = address;
        Department = dept;
        Salary = sal;
    }
}