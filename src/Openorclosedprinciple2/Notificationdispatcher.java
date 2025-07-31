package Openorclosedprinciple2;
import java.util.*;

public class Notificationdispatcher {
public Map<String, Notificationservice> notificationservice=null;
public Lognotification logger;

public Notificationdispatcher(Lognotification logger) {
	this.logger=logger;
	this.notificationservice =new HashMap<String, Notificationservice>();
}

public void registerservice(Notificationservice service) {
	notificationservice.put(service.getType().toUpperCase(), service);
}

public void dispatch(String type,String recipient, String message) {
	String uppercasetype=type.toUpperCase();
	Notificationservice service=notificationservice.get(uppercasetype);
	if(service!=null) {
		service.sendnotification(recipient, message);
		logger.log(uppercasetype, recipient, message);
	}
	
	else {
		throw new IllegalArgumentException("No notification service registered");
	}
	}
}



