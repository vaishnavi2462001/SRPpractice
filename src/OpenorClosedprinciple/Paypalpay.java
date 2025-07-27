package OpenorClosedprinciple;

public class Paypalpay implements Payment{
	
	@Override
	public void paymentprocess(double amount) {
		System.out.println("paypal amount is-- "+amount);
	}

}
