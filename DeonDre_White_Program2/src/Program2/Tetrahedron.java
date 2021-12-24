package Program2;

public class Tetrahedron extends ThreeDimensionalShape {
	
private double edge;
	

//	public Circle(double area, double volume) {
//		super(area, volume);
//		// TODO Auto-generated constructor stub
//	}
	
	
	public Tetrahedron(double edge) {
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
		return  Math.sqrt(3.0) * (Math.pow(edge, 2));
		
	}
	
	@Override
	public double calculateVolume() {
		
		return (Math.pow(edge, 3) / (6 * Math.sqrt(2.0)));
	}
	
	@Override
	public String toString() {
		return String.format("%nThe area of Tetrahedron: %.2f%nThe Volume of Tetrahedron: %.2f",
				calculateArea(), calculateVolume() );
		
	}

}
