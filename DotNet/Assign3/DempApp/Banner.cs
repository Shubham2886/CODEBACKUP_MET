namespace Sujitbanners;

public class Banner
{
    private double width {get; set;}
    private double height{get; set;}

    public Banner(double w, double h)
    {
        width = w;
        height = h;
    }

   public Banner ()
   {
     width = 20;
     height = 15;

   }
    
    public virtual double GetArea()
    {
        return width * height;
    }
    






}