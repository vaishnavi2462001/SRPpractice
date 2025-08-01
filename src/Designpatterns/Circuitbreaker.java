package Designpatterns;

public class Circuitbreaker {

	private enum Status {CLOSE, OPEN, HALF_OPEN}
	private Status s=Status.CLOSE;
	private final int failurethreshold;
	private final long reset_timeout;
	private int failcount=0;
	private long lastfailtime;
	
	public Circuitbreaker(int failurethreshold, long reset_timeout) {
		this.failurethreshold=failurethreshold;
		this.reset_timeout=reset_timeout;
	}
	
	public void recordsuccess() {
		s=Status.CLOSE;
		failcount=0;
		System.out.println("Circuit Breaker - Reset to close");
	}
	
	public void recordfail() {
		failcount++;
		if(failcount>=failurethreshold) {
			s=Status.OPEN;
			lastfailtime=System.currentTimeMillis();
			System.out.println("Circuit Breaker - Tripped to open");
		}
	}
	
}
