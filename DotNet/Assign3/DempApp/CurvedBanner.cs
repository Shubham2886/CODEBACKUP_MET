namespace Sujitbanners;

class CurvedBanner : Banner 
{
    public double Radius { get; set;}

   public CurvedBanner ( double w, double h, double r) : base (w,h)
   {
      Radius =r;
   }

    public override double GetArea()
    {
        return base.GetArea()-0.86* Radius * Radius;
    }
}