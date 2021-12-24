package Program2;

public class Cube extends ThreeDimensionalShape {
	
private double edge;
	

//	public Circle(double area, double volume) {
//		super(area, volume);
//		// TODO Auto-generated constructor stub
//	}
	
	
	public Cube(double edge) {
		super(edge);
		
		if (edge < 0.0) // validate wage
	         throw new IllegalArgumentException(
	            "radius must be >= 0.0");
		
		this.edge = edge;	
		
	}
	
	public double getEdge() {
		return edge;
	}


	public void setEdge(double edge) {
		this.edge = edge;
	}


	public double calculateArea() {
		return  6 * getEdge() * getEdge();
		
	}
	
	@Override
	public double calculateVolume() {
		
		return getEdge() * getEdge() * getEdge();
	}
	
	@Override
	public String toString() {
		return String.format("%nThe area of Cube: %.2f%nThe Volume of Cube: %.2f",
				calculateArea(), calculateVolume() );
		
	}

}
