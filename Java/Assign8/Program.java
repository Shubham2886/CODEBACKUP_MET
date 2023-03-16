import MetTours.*;

class Program {
	public static void main(String[] args)throws Exception{
	
		int days = Integer.parseInt(args[0]);
		int person = Integer.parseInt(args[1]);
		var c = Class.forName(args[2]);
		var price = c.getMethod(args[3],int.class, int.class);
		var scheme = c.getConstructor().newInstance()
;
		var md = price.getAnnotation(MetTours.LuxuryTax.class);
		float f = md != null ? md.value() : 8;
		double r = (double)price.invoke(scheme, days, person);
		double total = r* f/100;
		System.out.printf("Your Price is:%.2f%n and Tax is:%.2f%n",r,total);
							
	
	
	}
	

}
