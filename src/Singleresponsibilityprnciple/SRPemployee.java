package Singleresponsibilityprnciple;

public class SRPemployee {

	private String name;
	private String position;
	private double salary;
	

	public SRPemployee(String name, String position, double salary) {
		this.name=name;
		this.position=position;
		this.salary=salary;
	}

	public String getname() {
		return name;
	}
	
	public void setname(String name) {
		this.name=name;
	}
	
	public String getposition() {
		return position;
	}
	
	public void setposition(String position) {
		this.position=position;
	}
	
	public double getsalary() {
		return salary;
	}
	
	public void setsalary(double salary) {
		this.salary=salary;
	}

	}


