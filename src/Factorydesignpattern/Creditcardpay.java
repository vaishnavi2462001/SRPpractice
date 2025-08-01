package Factorydesignpattern;

public class Creditcardpay implements Payment {

	@Override
	public void process(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Credit card processing amount - "+amount);
	}
	
}
