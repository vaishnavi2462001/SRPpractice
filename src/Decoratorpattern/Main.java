package Decoratorpattern;

public class Main {

	public static void main(String[] args) {
		Coffee coffee=new Whippedcreamdecorator(
				           new Sugardecorator(
						      new Milkdecorator(
								new Simplecofee(
						                          ))));
				


		System.out.println(coffee.getdetails()+" CA$"+coffee.getcost());
	}

}
