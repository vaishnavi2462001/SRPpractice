package Factorydesignmethod2;

public abstract class Logistics {
	public abstract Transport settransport();
	public void plan() {
		Transport trans=settransport();
		trans.deliver();
	}

}
