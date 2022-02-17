package Lab3;

import java.util.Scanner;

public class CongNhanTest {
	public static void menu() {
		System.out.println("-------------Quan ly cong nhan---------------");
		System.out.println("1.Nhap danh sach cong nhan");
		System.out.println("2.Hien danh sach cong nhan");
		System.out.println("3.Hien danh sach cong nhan co luong lon hon S");
		System.out.println("0.Thoat Chuong trinh");
	}

	public static void main(String[] args) {
		Congnhan CN = new Congnhan();
		DSCN dscn= new DSCN();
		int choice;
		Scanner in = new Scanner(System.in);
		menu();
		do {
			System.out.println("Nhap lua chon cua ban: ");
			choice = in.nextInt();
			switch(choice) {
				case 1:
					dscn.nhapSCN();
					dscn.nhapDSCN();
					break;
				case 2: 
					dscn.HienDSCN();
					break;
				case 3: 
					System.out.println("Nhap s: ");
					int s = in.nextInt();
					dscn.HienDSCNDK(s);
					break;
				default:
					System.out.println("Moi ban nhap lai: ");
			}
			
		}while(choice != 0);
		
	}
}
