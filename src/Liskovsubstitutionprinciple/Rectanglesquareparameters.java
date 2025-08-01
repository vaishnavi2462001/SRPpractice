package Liskovsubstitutionprinciple;

public class Rectanglesquareparameters {
	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		r.setheight(5);
		r.setwidth(10);
		System.out.println("area of rectangle---" + r.calculatearea());

		// using square in place of rectangle
		Rectangle sr = new Square();
		sr.setwidth(5);
		sr.setheight(10);
		System.out.println("square as rectangle area ---" + sr.calculatearea());

	}
}
