package Factorydesignpattern;

public class Cryptopay implements Payment{
	

	@Override
	public void process(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Crypto payment processing amount - "+amount);
		
	}
}
