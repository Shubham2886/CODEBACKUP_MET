package series;

public abstract class Loan {

	 double Principle;
	 float Period;
	

	public double getPrinciple() {
		return Principle;
	}

	public float getPeriod() {
		return Period;
	}

	public void setPrinciple(double Principle) {
	this.Principle = Principle;
	}

	public void setPeriod(float Period) {
	this.Period = Period;
	}

	public double getEmi() {
		double emi = Principle * (1 + getRate() * Period/100) / (12 * Period);
		return emi;
	

	}


	public abstract double getRate(); 

}
