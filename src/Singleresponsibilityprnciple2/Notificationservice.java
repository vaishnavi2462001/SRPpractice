package Singleresponsibilityprnciple2;

public class Notificationservice {
	
	//creating obj for separate classes
	private Emailservice emailservice;
	private Lognotification lognotify;
	private Smsservice smsservice;
	
	public Notificationservice() {
		this.emailservice=emailservice;
		this.smsservice=smsservice;
		this.lognotify=lognotify;
	}
	
	public void sendemailnotification(String to, String subject,String body) {
		emailservice.sendemail(to, subject, body);
		lognotify.lognotificationmethod("Email", to, body);
	}
	
	public void sendsmsnotification(String to, String message) {
		smsservice.sendsms(to, message);
		lognotify.lognotificationmethod("SMS", to, message);   //SMS and Email are the types of msgs
	}
}
