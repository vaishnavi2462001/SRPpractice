package Dependencyinversionprinciple;

public class Orderprocess {
	private Mysqldata my;
	
	public Orderprocess() {
		this.my=new Mysqldata();
	}
	
	public void processorder(String orderdetails) {
		my.saveorder(orderdetails);
	}

}
