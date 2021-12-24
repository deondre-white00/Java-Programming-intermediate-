package Program2;

public class Circle extends TwoDiemnsionalShape {
	
	private double radius;
	

//	public Circle(double area, double volume) {
//		super(area, volume);
//		// TODO Auto-generated constructor stub
//	}
	
	
	public Circle(double radius) {
		super(radius);
		
		if (radius < 0.0) // validate wage
	         throw new IllegalArgumentException(
	            "radius must be >= 0.0");
		
		this.radius = radius;	
		
	}
	
	public double getRadius() {
		return radius;
	}


	public void setRadius(double radius) {
		this.radius = radius;
	}


	public double calculateArea() {
		return  getRadius() * getRadius() * Math.PI;
		
	}
	
	@Override
	public String toString() {
		return String.format("The area of Circle: %.2f",
				calculateArea() );
		
	}

}
