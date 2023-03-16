package series;

class PowerSequence extends Sequence implements Resetable {
	private int level;
	
	public PowerSequence (int num, int power){
		current = num;
		level = power;
		
	}

	public int getNext(){
		int term = current;
		current *= level;
		return term;
	}

	public void setReset(int num){
		current = num;
	}
}
