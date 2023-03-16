package series;
public abstract class Sequence{

	protected int current;

	
	public int getSum(int count){
		int total=0;
		for (int i=1;i<=count;++i){
			total+=getNext();
		}
		return total;
	}

	public abstract int getNext();

}




