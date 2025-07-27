package OpenorClosedprinciple;

public class Creditcardpay implements Payment {
	@Override
	public void paymentprocess(double amount) {
		System.out.println("credit card payment amount is --- "+amount);
	}
}
