class Program{
	public static void main(String args[]){
		int eid = Integer.parseInt(args[0]);
		String name = args [1];
		String Designation = args [2];

		var Emp1 = new Employee(eid, name, Designation);
		System.out.printf("Employee Created");
		System.out.printf("count:%d%n",Employee.getCount());
		System.out.println(Emp1);

		var Emp2 = new Employee(10002, "Raj",  "SalesPerson");
		System.out.printf("Employee Created");
		System.out.printf("count:%d%n",Employee.getCount());
		System.out.println(Emp2);


}
}
