package Abstractfactory;

public class Applicationobj {
	private Button butt;
	private Checkbox check;
	
	public Applicationobj(GUI gui) {
		butt=gui.createbutton();
		check=gui.createcheck();
	}
	
	public void rendergui() {
		butt.render();
		check.tick();
	}
}
