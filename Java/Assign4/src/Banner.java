package advertisment;

public class Banner{
	private double width;
	private double height;

	public Banner ()
	{
		width = 20;
		height = 12;
	
	}
	public Banner(double w,double h){
		width = w;
		height = h;
		
	}



	public void setWidth(double width){
		width = width;
	}



	public double getWidth(){
		return width;
	}
	


	public void setHeight(double height){
		height = height;
	}
	

	public double getHeight(){
		return height;
	}
	

	public double getArea(){
		return width*height;
	}


}
