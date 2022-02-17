package Lab9;

public class Staff {
	private String fullName;
	private String gender;
	private int age;
	private String address;
	
	public Staff(String fullName, String gender, int age, String address) {
		this.fullName = fullName;
		this.gender = gender;
		this.age = age;
		this.address = address;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Staff [fullName=" + fullName + ", gender=" + gender + ", age=" + age + ", address=" + address + "]";
	}

	
	
	
	
}
