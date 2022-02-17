package Lab8;

import java.util.Scanner;

public class Students extends Person {
	private String className;

	public Students(String fullName, String gender, String className) {
		super(fullName, gender);
		this.className = className;
	}

	public Students() {
	}

	public void inputStudents() {
		super.inputPerson();
		System.out.println("Nhap vao ten lop: ");
		this.className = new Scanner(System.in).nextLine();
	}
	
	
	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public void showInformationStudents() {
		super.showInformationPerson();
		System.out.println("Ten lop: "+ this.className);
	}
}
