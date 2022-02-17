package Lab5;

import java.util.Scanner;

public class TKmain {
	public static void main(String[] args) {
		TaiKhoan tk = new TaiKhoan(123456, "NINH DUC ANH", 1000000, 0.05);
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so tien muon gui: ");
		double napTien = sc.nextDouble();
		System.out.println("So tien sau khi gui vao la: " + tk.guiTienVao(napTien));
		System.out.println("Nhap so tien muon rut: ");
		double tienRut = sc.nextDouble();
		System.out.println("So tien sau khi rut ra la: " + tk.rutTien(tienRut));
		System.out.println("So tien sau khi dao han la: " + tk.daoHan());
	}
}
