using  MetTours;
using System.Reflection;
delegate double Package (int days, int Person);
class Program{
public static void Main(string[] args)
{
  int days = int.Parse(args[2]); 
    int Person = int.Parse(args[3]);
  
  //int days = 4 ; 
  //int Person = 3;
  var classcheck = Type.GetType(args[0]);
  var Methodcheck = classcheck.GetMethod(args [1]);
  var obj         = Activator.CreateInstance(classcheck);
  var amount      = Methodcheck.CreateDelegate<Package>(obj);
  var attri       =  Methodcheck.GetCustomAttribute<LuxuryTaxAttribute>();
  float tax = attri?.Tax ?? 8;
  

  Console.WriteLine ($"Total Price:{amount(days,Person)*(1+tax/100):0.00}");    
}
}
