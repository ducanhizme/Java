package Lab8;

import java.util.Scanner;

public class Main {
	public static void menu() {
		System.out.println("------------Menu--------------");
		System.out.println("1.Nhap vao thong tin sinh vien");
		System.out.println("2.Hien thong tin sinh vien");
		System.out.println("3.Sap xep ten lop");
		System.out.println("4.Thoat chuong trinh");
	}
	public static void main(String[] args) {
		int choice;
		menu();
		Management mgm = new Management();
		do {
			System.out.println("Moi ban nhap: ");
			choice= new Scanner(System.in).nextInt();
			switch(choice) {
			case 1:
				mgm.addStudents();
				break;
			case 2:
				mgm.showListInformationStudents();
				break;
			case 3:
				System.out.println("Sap xep thanh cong");
				mgm.sortingClassName();
				break;
			case 4:
				System.out.println("Da thoat truong trinh");
				System.exit(0);
			default:
				System.out.println("Moi  ban nhap lai: ");
			}
		}while(choice !=0);
	}
}
