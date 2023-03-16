import series.*;


class ProgramSequence{

	public static void reset(int num, Sequence that){
		if (that instanceof Resetable R){
			R.setReset(num);			
	}
	}

	public static void main(String[] args){
		int num = Integer.parseInt (args[0]);
		int diff= Integer.parseInt (args[1]);
		int fact = Integer.parseInt (args[2]);
		int count = Integer.parseInt (args[3]);
		Sequence Line = SeqCreator.createLinear(num, diff); 
		Sequence Pow  = SeqCreator.createPower(num, fact);

		System.out.printf("Total for LinearSequence after %d iteration is %d%n",count,Line.getSum(count));

	
		System.out.printf("Total for PowerSequence after %d iteration is %d%n",count,Pow.getSum(count));
	        
		reset(num, Pow);
	
		System.out.printf("Total for LinearSequence after %d iteration is %d%n",count,Line.getSum(count));

	
		System.out.printf("Total for PowerSequence after %d iteration is %d%n",count,Pow.getSum(count));
	
	
	
	}




}
