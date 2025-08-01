package Abstractfactory;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Applicationobj windowapp=new Applicationobj(new Windowgui());
		windowapp.rendergui();
		
		Applicationobj macapp=new Applicationobj(new Windowgui());
		macapp.rendergui();
		

	}

}
