package OpenorClosedprinciple;

public class Paymentparameters {
public static void main(String[] args) {
	Paymentprocessor pp=new Paymentprocessor();
	
	Payment cc=new Creditcardpay();
	Payment paypl=new Paypalpay();
	Payment bank=new Banktransferpay();
	
	pp.paymentprocess(paypl, 57.7);
	pp.paymentprocess(bank, 200.0);
	pp.paymentprocess(paypl, 55.0);
	
	Payment cp=new Cryptopay();
	pp.paymentprocess(cp, 76.0);
}
}
