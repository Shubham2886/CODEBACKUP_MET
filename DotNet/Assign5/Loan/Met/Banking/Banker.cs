namespace Met_Banking;

public static class Banker 
{
    public static Loan CreatePersonal ( double prin, float period )
    {
        return new PersonalLoan (prin, period);
    } 

    public static Loan CreateHome (double prin, float period)
    {
        return new HomeLoan (prin, period);
    }

}