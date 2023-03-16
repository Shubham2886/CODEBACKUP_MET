import payroll.Employee;
class Income {

	public static void main(String[] args) {

		System.out.println("ID, Hrs and Age");
	int	i = Integer.parseInt(args[0]);
	int 	h = Integer.parseInt(args[1]);
	int	a = Integer.parseInt(args[2]);
		Employee emp = new Employee(i, h, a);

	System.out.printf("Your ID is %d , hours:%d, Age:%d%n", emp.getId(), emp.getHrs(), emp.getAge());

	System.out.printf("Your Income is %.2f%n", emp.getIncome());
	
	System.out.printf("Your NetIncome is %.2f%n", emp.getNetIncome());


	}


}
