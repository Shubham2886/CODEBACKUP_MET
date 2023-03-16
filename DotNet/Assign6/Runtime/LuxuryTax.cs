namespace MetTours;

[AttributeUsage(AttributeTargets.Method)]

public class LuxuryTaxAttribute : Attribute
{
    public float Tax {get; set;}
    public LuxuryTaxAttribute(float value = 8 )
    {
        Tax = value;
    }
}