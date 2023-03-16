global using Microsoft.EntityFrameworkCore;
namespace DemoApp.StudentInfo;

public class Course
{
   
    public int Id { get; set; } 

    public string name { get; set; }
     
    public int fees { get; set; }

    public DbSet<student> Student { get; set; }

    
}