package Abstractfactory;

public class Macgui implements GUI{

	@Override
	public Button createbutton() {
		// TODO Auto-generated method stub
		return new Macbutton();
	}

	@Override
	public Checkbox createcheck() {
		// TODO Auto-generated method stub
		return new Maccheckbox();
	}
	

}
