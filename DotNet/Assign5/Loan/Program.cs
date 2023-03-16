using Met_Banking;

class Program
{
    static double ComputeTax(Loan that)
    {
        if (that is Taxable p)
            return p.GetTax();
        return 0;
    }
    public static void Main(string[] args)
    {
        double principle = double.Parse(args[0]);
        float period = float.Parse(args[0]);

        var Personal = Banker.CreatePersonal(principle, period);
        var Home = Banker.CreateHome(principle, period);

        Console.WriteLine($"EMI on Personal Loan : {Personal.GetEmi():0.00}");
        Console.WriteLine($"EMI on Home Loan : {Home.GetEmi():0.00}");

        Console.WriteLine($"Emi after Taxation: {ComputeTax(Personal):0.00}");

        if(Home is Discountable p)
            Console.WriteLine($"Emi after Discounting: {p.GetDiscount():0.00}");

          
    }
}






