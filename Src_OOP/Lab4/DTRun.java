package Lab4;

import java.util.Scanner;

public class DTRun {
	public static void menu() {
		System.out.println("-----------------------Menu-----------------------");
		System.out.println("1.Nhap doan thang");
		System.out.println("2.Xuat doan thang vua nhap");
		System.out.println("3.Xuat thong tin doan thang co do dai lon nhat");
		System.out.println("4.Tinh tong do dai cac doan thang da duoc nhap");
		System.out.println("5.Thoat chuong trinh");
	}

	public static void main(String[] args) {
		int choice;
		menu();
		QLDT ds = new QLDT();
		do {
			System.out.println("Moi ban nhap lua chon: ");
			Scanner sc = new Scanner(System.in);
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				ds.nhapDoanThang();
				break;
			case 2:
				ds.hienDoanThang();
				break;
			case 3:
				ds.hienDoDaiMax();
				break;
			case 4:
				double result;
				result = ds.tinhTongDoDai();
				System.out.println("Tong doi dai cac doan thang la: " + result);
				break;
			case 5:
				 System.exit(0);
			default:
				System.out.println("Moi ban nhap lai: ");

			}
		} while (choice != 0);
	}
}
