namespace Series;

public class LinearSequence : Sequence
{
internal int current;
private int step;

public LinearSequence(int cur, int stp)
{
    current = cur;
    step = stp;
}

public override int GetNext()
{
		int term=current;
		current += step;
		return term;


}
}