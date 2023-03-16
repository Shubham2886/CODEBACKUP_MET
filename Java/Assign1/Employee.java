package payroll;
public class Employee {

	private int id;
	private int hrs;
	private int age;

	public Employee(int ID,  int Hrs, int Age) {
		id = ID;
		hrs = Hrs;
		age = Age;

	}
	public int getId() {

	return id;

	}

	public void setID(int ID) {
	
	id = ID;

	}

	public int getHrs() {

	return hrs;
	}

	public void setHrs(int Hrs) {

	hrs = Hrs;
	}

	public int getAge() {
	
	return age;

	}

	public void setAge(int Age) {

	age = Age;

	}



	public double getIncome() {
		return hrs *100; 

	}
	public double getNetIncome(){
		double rate=100;
		if (hrs>180)
		{
		  return rate*180+(hrs-180)*(rate+100);
		 
		}
		return hrs*rate;
	}

}
