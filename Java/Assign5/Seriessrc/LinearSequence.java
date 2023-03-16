package series;


class LinearSequence extends Sequence {
	private int step;



	public LinearSequence(int num, int difference){
		current = num;
		step   	= difference;
	}

	public int getNext(){
		int term=current;
		current += step;
		return term;
	}
}
