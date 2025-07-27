package Singleresponsibilityprnciple;

public class Bonuscheck {
	public double calculatebonus(SRPemployee employee) {
		return employee.getsalary() * 0.1;
	}
	    public static void main(String[] args) {
	        SRPemployee employee = new SRPemployee("vaishnavi", "CASE spec", 300);
	        Bonuscheck bonuscheck = new Bonuscheck();
	        double bonus = bonuscheck.calculatebonus(employee);
	        System.out.println("Bonus for " + employee.getname() + " is: " + bonus);
	    }
	}
	

