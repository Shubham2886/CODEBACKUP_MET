package series;
class PersonalLoan extends Loan implements Taxable{
	
	 public PersonalLoan(double pri, float rte){
	 Principle = pri;
	 Period = rte;
	}

	public double getRate() {
	double rate;
	if(getPrinciple() <= 500000)
		return rate = 15;

	return rate = 16;
	
	}
	public double getTax(){
		return getPrinciple() > 1000000 ? 0.18 : 0.04;

	}
}
