package Factorydesignmethod2;

public class Roadlogistics extends Logistics{

	@Override
	public Transport settransport() {
		// TODO Auto-generated method stub
		return new Truck();
	}

}
