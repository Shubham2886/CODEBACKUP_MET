package payroll;

public class FullTimeStaff extends Staff{

	int department;

	public FullTimeStaff(String name, int address, int department){
	
	super(name, address);
	this.department = department;

	}

	public double getSalery(){
		double salery = 0;
		double amount;
	if(department == 1)
		salery = 20000;
	else if(department == 2)
		salery = 25000;
	else 
		salery = 10000;
	amount = salery * 0.12;
       		return amount;	
	}


}
