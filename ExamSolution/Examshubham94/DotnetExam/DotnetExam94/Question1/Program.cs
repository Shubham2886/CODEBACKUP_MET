
using name;
int a = 0;
int b = int.Parse(args[0]);
int c = int.Parse(args[1]); 

var comp = new Computation(b);


if (c == 0)
{
    Console.WriteLine($"The sum of Odd are : {comp.GetSumOf(a, b, comp.isOdd)}");
}

if (c == 1)
{
    Console.WriteLine($"The sum of even are : {comp.GetSumOf(a, b, comp.isEven)}");
}
if (c == 2)
{
    Console.WriteLine($"The sum of prime are : {comp.GetSumOf(a, b, comp.isPrime)}");
}
