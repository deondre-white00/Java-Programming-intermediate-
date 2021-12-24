package Program2;

public class Sphere extends ThreeDimensionalShape {
	
	
private double radius;
	

//	public Circle(double area, double volume) {
//		super(area, volume);
//		// TODO Auto-generated constructor stub
//	}
	
	
	public Sphere(double radius) {
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
		return  4 * getRadius() * getRadius() * Math.PI;
		
	}
	
	@Override
	public double calculateVolume() {
		
		return (4.0/3.0) * Math.PI * (getRadius() * getRadius() * getRadius());
	}
	
	@Override
	public String toString() {
		return String.format("%nThe area of Sphere: %.2f%nThe Volume of Sphere: %.2f",
				calculateArea(), calculateVolume() );
		
	}

}
