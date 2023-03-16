package series;

public  class SeqCreator{

	public static Sequence createLinear(int num, int step){
		Sequence A = new LinearSequence(num, step);
		return A;
	}

	public static Sequence createPower(int num, int factor){
		Sequence B = new PowerSequence(num, factor);
		return B;
	}
}	
