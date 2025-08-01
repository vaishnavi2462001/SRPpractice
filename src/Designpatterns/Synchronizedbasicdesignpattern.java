package Designpatterns;

public class Synchronizedbasicdesignpattern {
	private static Synchronizedbasicdesignpattern instance;

	private Synchronizedbasicdesignpattern() {
		System.out.println("Synchronizedbasicdesignpattern instance created");
	}

	public static synchronized Synchronizedbasicdesignpattern getInstance() {
		if (instance == null) {
			instance = new Synchronizedbasicdesignpattern();
		}
		return instance;
	}

	public void showmsg() {
		System.out.println("msg from Synchronizedbasicdesignpattern");
	}

}
