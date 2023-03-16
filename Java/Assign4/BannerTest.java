import advertisment.Banner;

class BannerTest{

	public static double bannerPrice(Banner B ,int copies){
		
		double rate = copies < 5 ? 10 :12;
		return rate * copies * B.getArea();
	}


	public static void main(String[] args){
		double w = Double.parseDouble(args[0]);
		double h = Double.parseDouble(args[1]);
		Banner B = new Banner(w,h);
		
		System.out.printf("Area of Banner = %f%n", B.getArea());
		
		double r= Double.parseDouble(args[2]);
		
		var D	= new advertisment.CurvedBanner(w,h,r);
		
		System.out.printf("Area of Curved Banner = %f%n", D.getArea());
	
		int copies = Integer.parseInt(args[3]);
	
		System.out.printf("Total Price = %f%n",bannerPrice(B , copies));
	}
}

