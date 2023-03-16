namespace Met.Hospital;

public class Patient
{

 public int PatientId { get; set;}

 public string PatientName { get; set; }

 public int BedType { get; set; }

 public int NoDays { get; set; }
 
 public Patient(int id, string name, int type, int days)
 {
    PatientId   = id;
    PatientName = name;
    BedType     = type;
    NoDays      = days;

 }

 double BedPrice ()
 {
   switch (BedType)
    {
        case 1 : return 500;

        case 2 : return 350;
        
        case 3 : return 200;

        default: return 1;
    }

 }
 public virtual double GetBillAmount()
 {   if (BedPrice() == 1)
        return 100; 
     
     return NoDays * BedPrice();  

 }

  
}