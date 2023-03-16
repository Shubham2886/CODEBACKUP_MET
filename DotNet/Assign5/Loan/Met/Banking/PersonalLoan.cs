namespace Met_Banking;

class PersonalLoan : Loan , Taxable 
{
    internal PersonalLoan(double prin, float period) 
    {
      Principle = prin;
      Period    = period;   
    }

    public override float GetRate()
    {
        if (base.Principle < 500000)
            return 15;

        return 16;
    }

    public double GetTax()
    {
        return GetEmi()* 1.18;
    }


}