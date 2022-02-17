package Lab7;

import java.util.Scanner;

public class Main {
	public static void menu() {
		System.out.println("-------------------MENU---------------------");
		System.out.println("1.Nhap vao danh sach thong tin(toi da 3 lan)");
		System.out.println("2.Hien thong tin");
		System.out.println("3.Xoa 1 nguoi");
		System.out.println("4.Sap xep theo ten");
		System.out.println("5.Thoat chuong trinh");
	}
	public static void main(String[] args) {
		int choice;
		Management mgm = new Management();
		menu();
		do {
			System.out.println("Nhap vao lua chon cua ban: ");
			choice = new Scanner(System.in).nextInt();
			switch(choice) {
			case 1:
				mgm.input();
				break;
			case 2:
				mgm.show();
				break;
			case 3:
				mgm.removeObj();
				break;
			case 4:
				mgm.sortFullName();
				break;
			case 5:
				System.exit(0);
			}
		}while(choice !=0);
	}
}
