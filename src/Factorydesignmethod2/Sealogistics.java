package Factorydesignmethod2;

public class Sealogistics extends Logistics {

	@Override
	public Transport settransport() {
		// TODO Auto-generated method stub
		return new Ship();
	}

}
