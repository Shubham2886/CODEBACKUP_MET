package MetTours;

public class Premium{
	@LuxuryTax
	public double Common(int days, int person){
	return 1200 * days * person;

	}
	
	public double Seniors(int days, int person){
	
	return Discount(days, person) - 100;
	}
	@LuxuryTax(15)
	public double Women(int days, int person){
	
	return Discount(days, person) - 200;
	}


	double Discount(int days, int person){
		int a = days;
		int b = person;
	double total = Common(a, b);
	if(a > 6 && b >= 4)
		return (total - 100) * a * b;
	else 
		return total;
	
	}

}
