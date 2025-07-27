package Singleresponsibilityprnciple;

public class Employeerport {
	public void getereport(SRPemployee employee) {
		System.out.println("getting report for " + employee.getname());
	}

	    public static void main(String[] args) {
	       
	        SRPemployee employee = new SRPemployee("vaishnavi", "CASE spec", 300);
	        Employeerport report = new Employeerport();
	        report.getereport(employee);
	    }
	}


