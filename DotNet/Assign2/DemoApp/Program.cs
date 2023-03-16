using Met.Hospital;
int id = int.Parse(args[0]);
int Bed = int.Parse(args[2]);
int  No_of_days = int.Parse(args[3]);


var pat = new Patient( 1001, "Sujit", 2, 5);
var patient = new Patient (id, args[1], Bed, No_of_days);

var Inpatient = new InHousePatient (1003, "Suraj", 2, 5, 6);
var Inpatient1 = new InHousePatient (1004, "Mane", 2, 5, 2);


var temp = patient.GetBillAmount();
    if (temp == 100) 
     Console.WriteLine("Invalid BedType");
    else 
     Console.WriteLine($"{patient.GetBillAmount()}") ;

Console.WriteLine($"{pat.GetBillAmount()}");

var temp1= Inpatient.GetBillAmount();
    if (temp == 14) 
     Console.WriteLine("Invalid BedType");
    else 
     Console.WriteLine($"{Inpatient.GetBillAmount()}") ;

Console.WriteLine($"{Inpatient1.GetBillAmount()}");
