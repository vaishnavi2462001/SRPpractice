package Facadedesignpattern;

public class Sound {
	public void seton() {
		System.out.println("Sound system is on----");
	}
	
	public void setvolume(int level) {
		System.out.println("Sound volume is set to "+level+" level");
	}
	
	public void setoff() {
		System.out.println("Sound system turned off");
	}

}
