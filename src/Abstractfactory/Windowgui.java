package Abstractfactory;

public class Windowgui implements GUI {

	@Override
	public Button createbutton() {
		// TODO Auto-generated method stub
		return new Windowbutton();
	}

	@Override
	public Checkbox createcheck() {
		// TODO Auto-generated method stub
		return new Windowcheckbox();
	}

}
