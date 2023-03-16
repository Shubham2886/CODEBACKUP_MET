package series;

class HomeLoan extends Loan implements Discountable { 
	public HomeLoan(double pri, float rte){
	
	Principle = pri;
	Period = rte;

	}

	public double getRate(){
	double rate;
	if(getPrinciple() <= 2000000)
		return rate = 10;
	return 11;
	
	}
	public double getDiscount() {
		return getPrinciple() < 2000000 ? 0.05 : 0.08;
		
	}

}
