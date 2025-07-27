package Liskovsubstitutionprinciple;

class Rectangle {
	protected int width;
	protected int height;
	
	public void setwidth(int width) {
		this.width=width;
	}
	
	public void setheight(int height) {
		this.height=height;
	}
	
	public int getwidth() {
		return width;
	}
	
	public int getheight() {
		return height;
	}
	
	public int calculatearea() {
		return width*height;
	}
}
