package series;

public class CallLoan {

	public static Loan CallPersonal(double pri, float prd){
	var A = new PersonalLoan(pri, prd);
	return A;
	}


	public static Loan CallHome(double pri, float prd){
	var B = new HomeLoan(pri, prd);
	return B;
	}

	private CallLoan() {}

}
