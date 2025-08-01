package Decoratorpattern;

public class Sugardecorator extends COffeedecorator{

	public Sugardecorator(Coffee coffee) {
		super(coffee);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String getdetails() {
		// TODO Auto-generated method stub
		return decoratedcoffee.getdetails()+" sugar---";
	}

	@Override
	public double getcost() {
		// TODO Auto-generated method stub
		return decoratedcoffee.getcost()+0.99;
	}

}
