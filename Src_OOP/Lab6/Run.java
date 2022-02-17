package Lab6;

import java.util.Scanner;

public class Run {
	public static void menu() {
		System.out.println("-------------------MENU--------------------");
		System.out.println("1.Nhap danh sach cac tu lanh");
		System.out.println("2.In danh sach cac tu lanh da nhap");
		System.out.println("3.Liet ke ca dnah sach tu lanh theo hang sx");
		System.out.println("4.Tinh tong tien ca tu lanh ");
		System.out.println("5.In tu lanh co dung tich tren 200l");
		System.out.println("6.Danh sach theo thu tu giam dan");
		System.out.println("7.De thoat chuong trinh");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		QuanLy dstl = new QuanLy();
		int choice;
		menu();
		do {
			System.out.println("Moi ban chon: ");
			choice = sc.nextInt();
			switch(choice) {
			case 1: 
////				tl.nhapTuLanh();
////				dstl.nhapDS(tl);
				
				dstl.nhapDS();
				
//				sc.nextLine();
				
				System.out.println("Nhap vao ten hang: ");
				String tenHang = sc.nextLine();
				System.out.println("Nhap vao ma hang: ");
				int maHang = sc.nextInt();
				sc.nextLine();
				System.out.println("Nhap vao nuoc san xuat: ");
				String nuocSX = sc.nextLine();
				System.out.println("Nhap dung tich: ");
				int dungTich = sc.nextInt();
				sc.nextLine();
				System.out.println("Nhap mau sac: ");
				String mauSac = sc.nextLine();
				System.out.println("Nhap hang san xuat: ");
				String hangSX = sc.nextLine();
				System.out.println("Nhap so luong: ");
				int soLuong = sc.nextInt();
				System.out.println("Nhap don gia: ");
				Float donGia = sc.nextFloat();
				TULANH tl = new TULANH(tenHang, maHang, nuocSX, dungTich, mauSac, hangSX, soLuong, soLuong);
				dstl.nhapDS(tl);
				break;
			case 2:
				dstl.hienDS();
				break;
			case 3:
				sc.nextLine();
				System.out.println("Nhap vao hang san xuat de tim kiem: ");
				String hangsx = sc.nextLine();
				dstl.lietKeTheoHangSanXuat(hangsx);
				break;
			case 4:
				float result;
				result = dstl.tinhTongTien();
				System.out.println("Tong tien tu lanh: "+result);
				break;
			case 5:
				System.out.println("Danh sach cac tu lanh co dung tich tren 200l");
				dstl.dungTich200L();
				break;
			case 6:
				System.out.println("Danh sach giam dan: ");
				dstl.sapXepGiamDan();
				
				break;
			case 7:
				System.exit(0);
			}
		}while(choice != 0);
	}
	
}
