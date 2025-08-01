package Designpatterns;

public enum Enumsingleton {
	INSTANCE;  //creates one instance at beginning and cannot have more than one instance
	
	private Enumsingleton() {
		System.out.println("Enumsingleton instance created");
	}
	
	public void showmsg() {
		System.out.println("msg from Enumsingleton");
	}

	public static void main(String[] args) {
		Enumsingleton e=Enumsingleton.INSTANCE;
		e.showmsg();
		
		Enumsingleton e2=Enumsingleton.INSTANCE;
		e2.showmsg();

		System.out.println("same instances --"+(e==e2));


	}

}
//