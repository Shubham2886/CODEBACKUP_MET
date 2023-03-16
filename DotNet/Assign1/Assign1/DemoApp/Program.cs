

int a = int.Parse(args[0]);
    
int b = int.Parse(args[1]);

bool e = MathUtil.Iseven(a);
if(e == true)
    Console.WriteLine("Number is Even");
    


bool x = MathUtil.Isodd(a);
if(x == true)
    Console.WriteLine("Number is odd");

    
bool y = MathUtil.IsPrime(a);
if(x == true)
    Console.WriteLine("Number is prime");
    else
    Console.WriteLine("Number is not Prime");

int z = MathUtil.reverseNumber(a);
Console.WriteLine($"reverse number is:{z}");

int m = MathUtil.countDigit(a);
Console.WriteLine($"sum of digits is:{m}");

Console.WriteLine($"primes no. between {a} & {b}:{MathUtil.countPrimes(a, b)}");


    



