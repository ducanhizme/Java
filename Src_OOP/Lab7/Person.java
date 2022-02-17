package Lab7;

public class Person {
	private String fullName;
	private String address;

	public Person(String fullName, String address) {
		this.fullName = fullName;
		this.address = address;
	}

	public Person() {
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Full Name: " + this.fullName + "\nAddress: " + this.address;
	}

}
