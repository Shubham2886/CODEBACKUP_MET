namespace MetTours;


class PremiumTours
{
    [LuxuryTax(10)]
    public double Common(int days, int Person) => CheckDiscount(days, Person);

    public double Seniors(int days, int Person)
    {
        return CheckDiscount(days, Person) - 100;
    }

    [LuxuryTax(15)]
    public double Woman (int days, int Person) => CheckDiscount(days, Person) - 200;
    internal double CheckDiscount(int days, int Person)
    {
        var Total = days * Person* 1200;
        if ((days > 6) && (Person >= 4))
        {
            return Total - 200 * days * Person;
        }
        else if (days > 6)
        {
            return Total - 100 * days * Person;
        }
        else if (Person >= 4)
        {
            return Total - 100 * days * Person;
        }
         
         return Total;
        }
    }
