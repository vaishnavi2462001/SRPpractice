package Decoratorpattern;

abstract class COffeedecorator implements Coffee{

	protected Coffee decoratedcoffee;
	public COffeedecorator(Coffee coffee) {
		this.decoratedcoffee=coffee;
	}
	public String getdetails() {
		return decoratedcoffee.getdetails();
	}
	public double getcost() {
		return decoratedcoffee.getcost();
	}
}
