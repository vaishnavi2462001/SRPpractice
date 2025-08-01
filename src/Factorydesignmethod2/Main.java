package Factorydesignmethod2;

public class Main {

	public static void main(String[] args) {

		Logistics log=new Roadlogistics();
		log.plan();
		
		Logistics log2=new Sealogistics();
		log2.plan();
		
	}

}
