package Singleresponsibilityprnciple2;

public class Smsservice {
	public void sendsms(String to, String message) {
		System.out.println("printing SMS----");
		System.out.println("message--" + message);
		System.out.println("to--" + to);
	}
}
