package Builderdesignpattern;

public class Nobuilder {
	
	private String firstname;
	private String lastname;
	private int age;
	private String phone;
	private String address;
	
	public Nobuilder(String firstname, String lastname) {
		this.firstname=firstname;
		this.lastname=lastname;
	}
	
	public Nobuilder(String firstname, String lastname,int age) {
		this.firstname=firstname;
		this.lastname=lastname;
		this.age=age;
	}
	
	public Nobuilder(String firstname, String lastname,int age, String phone) {
		this.firstname=firstname;
		this.lastname=lastname;
		this.age=age;
		this.phone=phone;
	}
	
	public Nobuilder(String firstname, String lastname,int age, String phone, String address) {
		this.firstname=firstname;
		this.lastname=lastname;
		this.age=age;
		this.phone=phone;
		this.address=address;
	}
}
