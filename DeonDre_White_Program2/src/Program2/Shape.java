package Program2;

public abstract class Shape {
	
	private final double area;
	private final double volume;
	
	public Shape (double area) {
		this.area = area;
		this.volume = 0;
	}
	
	public Shape (double area, double volume) {
		
		this.area = area;
		this.volume = volume;
	}

	public double getArea() {
		return area;
	}

	public double getVolume() {
		return volume;
	}
	
	public abstract double calculateArea();
	
	public abstract double calculateVolume();

}
