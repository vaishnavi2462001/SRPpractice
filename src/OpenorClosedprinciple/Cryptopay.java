package OpenorClosedprinciple;

public class Cryptopay implements Payment{
	@Override
	public void paymentprocess(double amount) {
		System.out.println("processing crypto payment ---"+amount);
	}
}
