namespace Met_Banking;

class HomeLoan : Loan, Discountable
{
    internal double  Limit {get; set;}
    public HomeLoan(double prin, float period)
    {
        Principle = prin;
        Period = period;
    }

    public override float GetRate()
    {
        
        if (base.Principle < 2000000)
            return 10;
        else if (base.Principle > Limit)
            return 12;

        return 11;      
     
    }
     public double GetDiscount ()
     {
        return base.GetEmi() * 0.95;
     }
}