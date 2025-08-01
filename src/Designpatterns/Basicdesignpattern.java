package Designpatterns;

public class Basicdesignpattern  {
	
	public static Basicdesignpattern instance; //by default instance is null
	
	private Basicdesignpattern() {
		System.out.println("Basicdesignpattern instance created");
	}

	public static Basicdesignpattern getInstance() {
		if(instance==null) {
			instance=new Basicdesignpattern();
		}
		return instance;
	}
	
	public void showmsg() {
		System.out.println("msg from Basicdesignpattern");
	}
	
	
	public static void main(String[] args) {
		Basicdesignpattern b1= Basicdesignpattern.getInstance();//new instance
		b1.showmsg();
		
		Basicdesignpattern b2=Basicdesignpattern.getInstance();  //another new instance
		b2.showmsg();
		
		System.out.println("both are same instances--"+(b1==b2));
		

	}

}
