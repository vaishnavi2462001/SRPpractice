package Factorydesignpattern;

public class Paymentobjects {
	public Payment createpay(String type) {
		return switch(type) {
		case "CC" -> new Creditcardpay();
		case "PP" -> new Paypalpay();
		case "Crypto" -> new Cryptopay();
		default -> throw new IllegalArgumentException("unknown payment type");
		};
	}

}
