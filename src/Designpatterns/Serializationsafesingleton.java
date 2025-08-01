package Designpatterns;

import java.io.Serializable;

public class Serializationsafesingleton implements Serializable{
	
	private static final long serialid=1L;
	private static Serializationsafesingleton instance;
	
	private Serializationsafesingleton() {
		System.out.println("Serializationsafesingleton instance created");
	}
	
	public static synchronized Serializationsafesingleton getInstance() {
		if(instance==null) {
			instance=new Serializationsafesingleton();
		}
		
		return instance;
	}
	
	
	protected Object readresolve() {
		return getInstance();
	}
	
	public void showmsg() {
		System.out.println("msg from Serializationsafesingleton");
	}
	
	public static void main(String[] args) {
		Serializationsafesingleton s1=Serializationsafesingleton.getInstance();
		s1.showmsg();
		
	}

}
