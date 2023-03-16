 using Sujitbanners;

class BannerTest 
{
   static double  BannerPrice(Banner that, int copies = 1)
    {  

        return that.GetArea () * 0.85 *copies;
    }
    public static void Main (string[] args)
    {
        double height = double.Parse(args[1]);
    
        double width  = double.Parse(args[0]);
        double radius  = double.Parse(args[2]);

        Banner B = new Banner();
        Banner B1 = new Banner(width,height );
        CurvedBanner CB = new(width, height, radius);
        
        Console.WriteLine($"Base Price of Banner :{BannerPrice(B)}");
        Console.WriteLine($"Price of Banner :{BannerPrice(B1, 6):0.00}");
        Console.WriteLine($"Price of CurvedBanner :{BannerPrice(CB, 5): 0.00}");
        
    }
}