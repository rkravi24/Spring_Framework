package springprogram5;

public class Student {
	private String name;
	private int rollno;
	private Address address;
	
	public void setName(String name) {
		this.name = name;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public void display() {
		System.out.println("Name: "+name);
		System.out.println("Rollno: "+rollno);
		System.out.println("Address: "+address);
	}
}
