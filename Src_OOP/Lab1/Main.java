package Lab1;

import java.util.Scanner;

public class Main {
	public static void Menu() {
		System.out.println("-----------------------Menu-----------------------");
		System.out.println("1.Nhap thong tin sinh vien");
		System.out.println("2.Xuất thông tin sinh vien");
		System.out.println("3.Tinh tong tien an ban tru");
		System.out.println("4.Hien thong tin sinh vien an ban tru tren 20 buoi");
		System.out.println("5.Sap xep thong tin hoc sinh theo tien an");
	}
	public static void main(String[] args) {
		int choice;
		DanhSachSinhVien ds = new DanhSachSinhVien();
		do {
			Menu();
			System.out.println("Moi ban nhap lua chon: ");
			Scanner sc = new Scanner(System.in);
			choice = sc.nextInt();
			sc.nextLine();
			switch (choice){
				case 1: 
					System.out.println("Nhap ma  sinh vien: ");
					String maSV = sc.nextLine();
					System.out.println("Nhap ho va ten sinh vien: ");
					String hoVaTen = sc.nextLine();
					System.out.println("Nhap vao ten lop: ");
					String lopHC = sc.nextLine();
					System.out.println("Nhap vao so buoi an ban tru: ");
					int soBuoiAnBanTru = sc.nextInt();
					SinhVien sv = new SinhVien(maSV, hoVaTen, lopHC, soBuoiAnBanTru);
					ds.addStudents(sv);
					break;
				case 2: 
					ds.showInfoStudents();
					ds.showMoney();
					break;
				case 3:
					int result = ds.totalCostOfMeals() ;
					System.out.println(result);
					break;
				case 4: 
					ds.showInfo20Meals();
					break;
				case 5:
					ds.sort();
					break;
				default:
					System.out.println("Moi ban nhap lai: ");
			}
		}while( choice  != 0);
	}
}
