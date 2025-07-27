package OpenorClosedprinciple;

public class Circle implements Shape{

	private double radius;
	public Circle(double r) {
		this.radius=radius;
	}
	
	@Override
	public double calculatearea() {
		return Math.PI*radius*radius;
	}
}
