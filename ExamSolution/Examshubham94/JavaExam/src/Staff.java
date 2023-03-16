package payroll;

public abstract class Staff{

	protected String name;
	protected int address;

	public String setName(String N){		name = N;

	}

	public String getName(){
	return name; 
	}

	public Staff(String name, int address){
		this.name = name;
		this.address = address;
	}
	
	public double getWork(){
		return 200 * getSalery();
	}



	public abstract double getSalery();

	
}
}
