package Decoratorpattern;

public class Whippedcreamdecorator extends COffeedecorator{

	public Whippedcreamdecorator(Coffee coffee) {
		super(coffee);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getdetails() {
		// TODO Auto-generated method stub
		return decoratedcoffee.getdetails()+"whipped cream---";
	}

	@Override
	public double getcost() {
		// TODO Auto-generated method stub
		return decoratedcoffee.getcost()+0.99;
	}
}
