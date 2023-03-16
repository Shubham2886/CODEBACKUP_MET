using Series;

class Program{
    static void Reset(int num, Sequence that)
        {
		    if(that is Resetable R)
            {
			R.SetReset(num);
            }
         }
    public static void Main(string[] args)
    {
        int x = int.Parse(args[0]);
        int y = int.Parse(args[1]);
        int z = int.Parse(args[2]);
        Sequence Power = new PowerSequence(x, y);
        Sequence Linear = new LinearSequence(x, y);
        Console.WriteLine(" Power Sequence is: {0:00}",Power.GetSum(z));
        Reset(x, Power);
        Console.WriteLine($"New Power Sequence is: {Power.GetSum(z)}");
       
        Console.WriteLine(" Power Sequence is: {0:00}",Linear.GetSum(z));
        Console.WriteLine($"New Power Sequence is: {Linear.GetSum(z)}");
        
    }
}    
        
         
        


    

