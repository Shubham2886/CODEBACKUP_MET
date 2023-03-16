public class Student 
{
  private int Id;

  private string name;

  private Date DOB;

  private int mark1;
  private int mark2;
  private int mark3;

public Student(int id, string name, string dob, int m1, int m2, int m3)
{
    Id = id;
    this.name = name;
    DOB = Date.ParseDate(dob);
    mark1 = m1;
    mark2 = m2;
    mark3 = m3;

}
    

    public void Display()
    {
        Console.WriteLine("ID       : "+Id);
        Console.WriteLine("Name     : "+name);
        Console.WriteLine("Dob      : {0}-{1}-{2}", Date.Day, Date.Month, Date.Year);
        Console.WriteLine("Subject 1: "+mark1);
        Console.WriteLine("Subject 2: "+mark1);
        Console.WriteLine("Subject 3: "+mark3);
    }
}