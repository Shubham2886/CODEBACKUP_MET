package payroll;
public class PartTimeStaff extends Staff{

	private int hours;

	public PartTimeStaff(String name,int address, int hours){
		super(name, address);
		this.hours = hours;
	
	}

	public double getSalery(){
	
	return hours<180?200:100;

	}

}
