package Lab8;

import java.util.Scanner;

public class Person {
	private String fullName;
	private String gender;

	public Person(String fullName, String gender) {
		this.fullName = fullName;
		this.gender = gender;
	}

	public Person() {
	}
	
	public void inputPerson() {
		System.out.println("Nhap vao ten cua : ");
		this.fullName = new Scanner(System.in).nextLine();
		System.out.println("Nhap vao gioi tinh: ");
		this.gender = new Scanner(System.in).nextLine();
	}
	
	public void showInformationPerson() {
		System.out.println("Ho va ten: "+ this.fullName);
		System.out.println("Gioi tinh: "+ this.gender);
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

	@Override
	public String toString() {
		return "Person [fullName=" + fullName + ", gender=" + gender + "]";
	}
	
	
}
