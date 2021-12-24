package Program2;

public class Triangle extends TwoDiemnsionalShape {
	
private double base;
private double height;



//	public Circle(double area, double volume) {
//		super(area, volume);
//		// TODO Auto-generated constructor stub
//	}
	
	
	public Triangle(double base, double height) {
		super(height, base);
		
		if (height < 0.0) // validate wage
	         throw new IllegalArgumentException(
	            "radius must be >= 0.0");
		
		if (base < 0.0) // validate wage
	         throw new IllegalArgumentException(
	            "radius must be >= 0.0");
		
		this.base = base;	
		this.height = height;
		
	}
	
	


	public double getBase() {
		return base;
	}




	public void setBase(double base) {
		this.base = base;
	}




	public double getHeight() {
		return height;
	}




	public void setHeight(double height) {
		this.height = height;
	}




	public double calculateArea() {
		return (getBase() * getHeight())/2;
		
	}
	
	@Override
	public String toString() {
		return String.format("The area of Triangle: %.2f",
				calculateArea() );
		
	}

}
