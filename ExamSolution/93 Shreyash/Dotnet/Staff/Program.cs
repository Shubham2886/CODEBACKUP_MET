using Met.Payroll;
Console.WriteLine("Welcome User: ");
Console.WriteLine("Choose type of Staff:");
Console.WriteLine("1: Full Time Staff\r\n2: Part Time Staff");
int choice = Convert.ToInt32(Console.ReadLine());


if (choice == 1)
{
    Console.WriteLine("Enter the Details Name, Address, Department, Salary");
    string name = Console.ReadLine();
    string address = Console.ReadLine();
    string dept = Console.ReadLine();
    decimal sal = Convert.ToDecimal(Console.ReadLine());
    var Jack = new FullTimeStaff(name, address, dept, sal);
    Console.WriteLine("Name:{0, 15}\r\nAddress:{1,15}\r\nDepartment:{2, 15}\r\nSal{3,15}",Jack.Name, Jack.Address, Jack.Department, Jack.Salary);
}
else
{
    Console.WriteLine("Enter the Details Name, Address, Number of Hours, Rate per Hours");
    string name = Console.ReadLine();
    string address = Console.ReadLine();
    int hour = Convert.ToInt32(Console.ReadLine());
    double rate = Convert.ToDouble(Console.ReadLine());
    var Jack = new PartTimeStaff(name, address, hour, rate);
    Console.WriteLine(@"Name  :{0, -8}
                       Address:{1,15}
                       Hours  :{2, 6}
                       Rate   :{3, 6}", Jack.Name, Jack.Address, Jack.NumberOfHours, Jack.RatePerHour);
}
