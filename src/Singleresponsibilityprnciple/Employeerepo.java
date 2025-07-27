package Singleresponsibilityprnciple;

public class Employeerepo {
	public void savedata(SRPemployee employee) {
		System.out.println("saving " + employee.getname() + "to database--");
	}
	 public static void main(String[] args) {
	        SRPemployee employee = new SRPemployee("vaishnavi", "CASE spec", 300);
	        Employeerepo repo = new Employeerepo();
	        repo.savedata(employee);
	    }

}
