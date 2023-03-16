global using Microsoft.EntityFrameworkCore;
namespace DemoApp.StudentInfo;
[Table("Student")]
public class student
{
    
    public int Id { get; set; } 

    public string name { get; set; }
     
    public int Age { get; set; }

    public string grade { get; set; }

    
}