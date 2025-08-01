package Designpatterns;

public class Eagersingleton {
	
	private static Eagersingleton instance=new Eagersingleton();
	
	private Eagersingleton() {
		System.out.println("Eagersingleton instance created");
	}
	
	public static Eagersingleton getInstance() {
		return instance;
	}
	
	public void showmsg() {
		System.out.println("msg from Eagersingleton");
	}

	public static void main(String[] args) {
		Eagersingleton b1=instance.getInstance();//new instance
		b1.showmsg();
		
		
				
	}
}
//gives copy of existing obj when created at beginning instance=new Eagersingleton()
