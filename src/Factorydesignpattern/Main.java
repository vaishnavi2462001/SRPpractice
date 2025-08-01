package Factorydesignpattern;

public class Main {

	public static void main(String[] args) {
		Paymentobjects obj=new Paymentobjects();
		
		Payment pay=obj.createpay("Crypto");
		pay.process(107.99);

	}

}
