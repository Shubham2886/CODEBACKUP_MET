namespace Series;

public class PowerSequence : Sequence, Resetable	
{
	internal int current;
	private int factor;
public PowerSequence(int cur, int fact)
{
    current = cur;
    factor = fact;
}

public override int GetNext()
{
		int term=current;
		current *= factor;
		return term;

}
public  void SetReset(int num)
		{
			current = num;

		}
}