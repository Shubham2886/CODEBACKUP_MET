global using Microsoft.EntityFrameworkCore;

namespace DemoApp.StudentInfo;

public class StudentInfoDbContext : DbContext
{

    public DbSet<student> Students { get; set; }

    public DbSet<Course> Courses { get; set; }

    protected override void OnConfiguring(DbContextOptionsBuilder optionsBuilder)
    {
        
  optionsBuilder.UseMySQL("Server=localhost;Database=shop;User ID=root;Password=root");
        
    }

   
}