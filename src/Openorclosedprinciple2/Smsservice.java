package Openorclosedprinciple2;

public class Smsservice implements Notificationservice{
	
	
	public void sendnotification(String to, String message) {
		System.out.println("printing SMS----");
		System.out.println("message--" + message);
		System.out.println("to--" + to);
		
	}
	
	public String getType() {
		return "SMS";
	}

}
