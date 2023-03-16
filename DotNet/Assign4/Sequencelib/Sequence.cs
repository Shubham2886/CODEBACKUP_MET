namespace Series;

public abstract class Sequence{

public double GetSum(int count)
{
    double  total=0;
		for (int i=1;i<=count;++i){
			total += GetNext();
		}
		return total;
}

        public abstract int GetNext();

}



