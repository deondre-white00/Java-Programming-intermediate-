package Program2;

public class Square extends TwoDiemnsionalShape {
	
private double length;
	

//	public Circle(double area, double volume) {
//		super(area, volume);
//		// TODO Auto-generated constructor stub
//	}
	
	
	public Square(double length) {
		super(length);
		
		if (length < 0.0) // validate wage
	         throw new IllegalArgumentException(
	            "radius must be >= 0.0");
		
		this.length = length;	
		
	}
	
	public double getLength() {
		return length;
	}


	public void getLength(double length) {
		this.length = length;
	}


	public double calculateArea() {
		return  getLength() * getLength();
		
	}
	
	@Override
	public String toString() {
		return String.format("The area of Square: %.2f",
				calculateArea() );
		
	}

}
