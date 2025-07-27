package OpenorClosedprinciple;

public class Banktransferpay implements Payment{
	
	@Override
	public void paymentprocess(double amount) {
		System.out.println("bank transfer pay--"+amount);
	}
}
