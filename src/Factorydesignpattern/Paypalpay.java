package Factorydesignpattern;

public class Paypalpay implements Payment{
	

	@Override
	public void process(double amount) {
		// TODO Auto-generated method stub
		System.out.println("PAYPAL processing payment amount is - "+amount);
		
	}

}
