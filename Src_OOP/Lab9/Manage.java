package Lab9;

import java.util.ArrayList;
import java.util.Scanner;

public class Manage {
	public void menu() {
		System.out.println("-----Menu-----");
		System.out.println("1.Chuyen vien");
		System.out.println("2.Giang vien");
		System.out.println("3.Quan ly");
		System.out.println("0.Thoat");
	}
	ArrayList<Staff> stafflist = new ArrayList<>();

	public Staff inputExpert() {
		System.out.println("Nhap ten chuyen vien: ");
		String fullName = new Scanner(System.in).nextLine();
		System.out.println("Nhap gioi tinh chuyen vien: ");
		String gender = new Scanner(System.in).nextLine();
		System.out.println("Nhap vao tuoi chuyen vien: ");
		int age = new Scanner(System.in).nextInt();
		System.out.println("Nhap vao dia chi chuyen vien: ");
		String address = new Scanner(System.in).nextLine();
		System.out.println("Nhap vao ten phong ban: ");
		String departmentName =  new Scanner(System.in).nextLine();
		System.out.println("Nhap vao he so luong chuyen vien: ");
		double coefficientSalary = new Scanner(System.in).nextDouble();
		return new Expert(fullName, gender, age, address, departmentName, coefficientSalary);
	}
	
	public Staff inputLecturer() {
		System.out.println("Nhap vao ten giang vien: ");
		String fullName = new Scanner(System.in).nextLine();
		System.out.println("Nhap gioi tinh giang vien: ");
		String gender = new Scanner(System.in).nextLine();
		System.out.println("Nhap vao tuoi giang vien: ");
		int age = new Scanner(System.in).nextInt();
		System.out.println("Nhap vao dia chi giang vien: ");
		String address = new Scanner(System.in).nextLine();
		System.out.println("Nhap vao ten khoa: ");
		String facultyName = new Scanner(System.in).nextLine();
		System.out.println("Nhap vao he so luong: ");
		double coefficientSalary = new Scanner(System.in).nextDouble();
		System.out.println("Nhap vao he so luong phu cap: ");
		double coefficientSalary2 = new Scanner(System.in).nextDouble();
		return new Lecturer(fullName, gender, age, address, facultyName, coefficientSalary, coefficientSalary2);
	}
	
	public Staff inputManager() {
		System.out.println("Nhap vao ten quan li: ");
		String fullName = new Scanner(System.in).nextLine();
		System.out.println("Nhap gioi tinh quan li: ");
		String gender = new Scanner(System.in).nextLine();
		System.out.println("Nhap vao tuoi quan li: ");
		int age = new Scanner(System.in).nextInt();
		System.out.println("Nhap vao dia chi quan li: ");
		String address = new Scanner(System.in).nextLine();
		System.out.println("Nhap vao noi cong tac: ");
		String workPlaceName = new Scanner(System.in).nextLine();
		System.out.println("Nhap vao he so luong: ");
		double coefficientSalary = new Scanner(System.in).nextDouble();
		return new Manager(fullName, gender, age, address, workPlaceName, coefficientSalary);
	}
	
	public void show() {
		for(Staff info : stafflist) {
			System.out.println(info);
		}
	}
	
	public void input() {
		menu();
		int choice;
		do {
			System.out.println("Nhap vao lua chon cua ban: ");
			choice =  new Scanner(System.in).nextInt();
			switch(choice) {
			case 1:
				stafflist.add(inputExpert());
				break;
			case 2:
				stafflist.add(inputLecturer());
				break;
			case 3:
				stafflist.add(inputManager());
				break;
			default:
				System.out.println("Moi ban nhap lai: ");
			}
		}while(choice !=0);
	}
}
