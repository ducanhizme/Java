package Lab7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Management {
	private int SIZE = 3;
	ArrayList<Person> manage = new ArrayList<>(SIZE);

	public Person inputStudents() {
		System.out.println("Nhap vao ho ten: ");
		String fullName = new Scanner(System.in).nextLine();
		System.out.println("Nhap vao dia chia: ");
		String address = new Scanner(System.in).nextLine();
		System.out.println("Nhap vao diem thu 1: ");
		float mark1 = new Scanner(System.in).nextFloat();
		System.out.println("Nhap vao diem thu 2: ");
		float mark2 = new Scanner(System.in).nextFloat();
		return new Students(fullName, address, mark1, mark2);
	}

	public Person inputEmployee() {
		System.out.println("Nhap vao ho ten: ");
		String fullName = new Scanner(System.in).nextLine();
		System.out.println("Nhap vao dia chia: ");
		String address = new Scanner(System.in).nextLine();
		System.out.println("Nhap vao he so luong: ");
		float hsl = new Scanner(System.in).nextFloat();
		return new Employee(fullName, address, hsl);
	}

	public Person inputCustomer() {
		System.out.println("Nhap vao ho ten: ");
		String fullName = new Scanner(System.in).nextLine();
		System.out.println("Nhap vao dia chia: ");
		String address = new Scanner(System.in).nextLine();
		System.out.println("Nhap vao ten cong ty: ");
		String companyName = new Scanner(System.in).nextLine();
		System.out.println("Nhap vao hoa don: ");
		float hoaDon = new Scanner(System.in).nextFloat();
		float tax = (float) (hoaDon * 0.1);
		float totalMoney = tax + hoaDon;
		return new Customer(fullName, address, companyName, hoaDon, tax, totalMoney);

	}

	public void menu() {
		System.out.println("--------------ENTER-------------");
		System.out.println("1.Students");
		System.out.println("2.Employee");
		System.out.println("3.Customers");
		System.out.println("0.EXIT");
	}

	public void input() {
		int choice;
		menu();
		do {
			System.out.println("Nhap vao lua chon cua ban: ");
			choice = new Scanner(System.in).nextInt();
			switch (choice) {
			case 1:
				manage.add(inputStudents());
				break;
			case 2:
				manage.add(inputEmployee());
				break;
			case 3:
				manage.add(inputCustomer());
				break;
			default:
				System.out.println("Moi ban nhap lai: ");
			}
		} while (choice != 0);
	}

	public void show() {
		for (Person info : manage) {
			System.out.println(info);
		}
	}

	public void removeObj() {
		String ten = new Scanner(System.in).nextLine();
		for (int i = 0; i < manage.size(); i++) {
			if (manage.get(i).getFullName().equalsIgnoreCase(ten)) {
				manage.remove(i);
			}
		}
	}

	public void sortFullName() {
		for (int i = 0; i < manage.size()-1; i++) {
			for (int j = i + 1; j < manage.size(); j++) {
				if (manage.get(i).getFullName().compareTo(manage.get(j).getFullName()) > 0) {
					Collections.swap(manage, i, j);
				}
			}
		}
		System.out.println("Info list after sorting");
		for (Person info : manage) {
			System.out.println(info);
		}
	}

}
