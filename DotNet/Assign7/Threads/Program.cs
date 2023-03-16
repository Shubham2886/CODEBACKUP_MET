class Program
{
    static void Main(string[] args)
    {
        int first = 1;
        int last = 10;

        Thread child = new Thread(() =>
       {
           for (int i = first; i <= last; ++i)
           {

               if (Worker.IsOdd(i))
                   Console.WriteLine($"thread child : {i}");
           }
       });
        child.Start();

        for (int i = first; i <= last; ++i)
        {
            if (Worker.IsEven(i))
                Console.WriteLine($"thread parent:{i}");
        }
    }

}