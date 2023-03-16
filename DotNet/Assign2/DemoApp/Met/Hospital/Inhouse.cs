namespace Met.Hospital;

public class InHousePatient : Patient {

    public double Discount { get; set; }

    public InHousePatient(int id, string name, int type, int days, double discount ) : base(id, name, type, days)
    {
        Discount = discount;
    }
    
    public override double GetBillAmount()
 {    
    
     return base.GetBillAmount() * (Discount/100);
 }



}