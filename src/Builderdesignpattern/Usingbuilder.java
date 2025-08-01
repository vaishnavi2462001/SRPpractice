package Builderdesignpattern;

public static class Usingbuilder {
	private final String firstname;
	private final String lastname;
	private int age;
	private String phone;
	private String address;
	
	public Usingbuilder(String firstname, String lastname) {
		this.firstname=firstname;
		this.lastname=lastname;
	}
	
	public Usingbuilder age(int age) {
		this.age=age;
		return this;
	}
	
	public Usingbuilder address(String address) {
		this.address=address;
		return this;
	}
	
	public Nobuilder build() {
		Nobuilder nob=new Nobuilder(this);
		validuserobj(nob);
		return nob;
	}
	
	private void validuserobj(Nobuilder nob) {
		if(nob.getage()<0) {
			throw new IllegalStateException("Age is negative");
		}
	}

	

}
