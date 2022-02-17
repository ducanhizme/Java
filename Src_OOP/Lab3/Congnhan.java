package Lab3;

import java.util.Scanner;

public class Congnhan {
	public static float lcb = 1150;// Luong co ban
	private float hsl;// he so luong
	private String hoten;
	

	public float getHsl() {
		return hsl;
	}

	public void setHsl(float hsl) {
		this.hsl = hsl;
	}

	public String getHoten() {
		return hoten;
	}

	public void setHoten(String hoten) {
		this.hoten = hoten;
	}

	public void NhapCongNhan() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ho ten:");
		hoten = sc.nextLine();
		System.out.print("He so luong:");
		hsl = sc.nextFloat();
	}
	public double tinhluong() {
		return this.hsl*this.lcb;
	}

	public void HienCongNhan() {
		System.out.println("Ho ten:" + hoten);
		System.out.println("He so luong:" + hsl);
		System.out.println("Luong:" + tinhluong());
	}
	
	
}
