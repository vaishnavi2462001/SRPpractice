package Liskovsubstitutionprinciple;

class Square extends Rectangle{
	
	@Override
	public void setwidth(int width) {
		super.setwidth(width);
		super.setheight(width);
	}
	
	@Override
	public void setheight(int height) {
		super.setheight(height);
		super.setwidth(height);
	}
	
}
