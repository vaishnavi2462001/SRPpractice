package Openorclosedprinciple2;

public class Emailservice implements Notificationservice {
	
	public void sendnotification(String to, String body) {
		System.out.println("Email msg---");
		System.out.println("Email to --"+to);
		System.out.println("Email body--"+body);
		
	}
	
	public String getType() {
		return "EMAIL";
		
	}
	
}
