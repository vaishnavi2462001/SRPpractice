package Openorclosedprinciple2;

public class Parametersocp {
public static void main(String[] args) {
	Lognotification logger=new Lognotification();
	Notificationdispatcher dispatcher=new Notificationdispatcher(logger);
	
	dispatcher.registerservice(new Emailservice());
	dispatcher.registerservice(new Smsservice());
	
	dispatcher.dispatch("SMS", "vaish7@gmail.com", "OCP SMS test");
	dispatcher.dispatch("Email", "vaish7@gmail.com", "OCP Email test");
	
	
	
}
}
