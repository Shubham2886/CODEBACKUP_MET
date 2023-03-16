class Employee{

	private int Id;
	private String Name;
	private String Designation;
	private static int count = 0;


	public Employee(){}

	public Employee (int eid, String name, String designation){
	Id = eid;
	Name = name;
	Designation = designation;
	++count;
	}
	public  String toString(){
	return Id+" "+Name+" "+Designation;
	}
	public static final int getCount(){
	return count; 
	}


	


}
