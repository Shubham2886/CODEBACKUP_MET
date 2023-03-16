package advertisment;
public class CurvedBanner extends Banner{
	private double radius;
		


//	public CurvedBanner(){
//		super();
//		radius = r;
//	}
	public CurvedBanner(double w ,double h ,double r){
		super(w,h);
		radius = r;
	}

	public void setRadius(int r){
		radius = r;
	}
	public double getRadius(){
		return radius;
	}
	public double getArea(){
		return getWidth() * getHeight() - 0.86 * radius * radius;
	}

}
