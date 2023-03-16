namespace name;
public class Computation

{
    private int number1;
   

    public Computation(int number1)
    {
        this.number1 = number1;
    }
    public  bool isEven(int number1)
    {
        if(number1 % 2 == 0) 
        return true;
        return false;
    }
    public  bool isOdd(int number1)
    {
        if(number1 % 2 != 0)
        return true;
        return false;
    }

    public  bool isPrime(int number1)
    {
        int count = 0;
        for(int n=1; n <= number1; ++n)
        {
            if(number1 % n == 0)
            count += 1;
        }

        if(count == 2)
        return true;
        return false;
    }

 
    public int GetSumOf(int low, int high, Check chk)
{
    int sum = 0;
    for(int i = low; i<= high; ++i)
    {
        bool a = chk.Invoke(i);
        if(a)
        {
            sum += i;
        }
    }
     return sum;
}


public delegate bool Check(int a);
}