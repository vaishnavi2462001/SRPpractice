package Decoratorpattern;

public class Milkdecorator extends COffeedecorator {

	public Milkdecorator(Coffee coffee) {
		super(coffee);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String getdetails() {
		// TODO Auto-generated method stub
		return decoratedcoffee.getdetails();
	}

	@Override
	public double getcost() {
		// TODO Auto-generated method stub
		return decoratedcoffee.getcost()+0.9;
	}


}
