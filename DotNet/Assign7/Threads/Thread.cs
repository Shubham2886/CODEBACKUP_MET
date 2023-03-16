using System.Runtime.CompilerServices;

public class Worker
{
    [MethodImpl(MethodImplOptions.Synchronized)]
    public static bool IsEven(int num)
    {
        lock (typeof(Worker))
        {
            if (num % 2 != 0)
                return false;
            Monitor.Pulse(typeof(Worker));
            Monitor.Wait(typeof(Worker));
            return true;
        }
    }

    public static bool IsOdd(int num)
    {
        lock (typeof(Worker))
        {
            if (num % 2 != 0)
            {
                //Monitor.Pulse(typeof(Worker));
                Monitor.Wait(typeof(Worker));
                Monitor.Pulse(typeof(Worker));
                return true;
            }
            return false;
        }
    }
}