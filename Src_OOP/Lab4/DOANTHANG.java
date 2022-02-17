package Lab4;

import java.util.Scanner;

public class DOANTHANG {
	private DIEM a;
	private DIEM b;
	Scanner sc = new Scanner(System.in);

	public DOANTHANG() {
		this.a = new DIEM();
		this.b = new DIEM();
	}

	public DOANTHANG(double x1, double y1, double x2, double y2) {
		this.a = new DIEM(x1, y1);
		this.b = new DIEM(x2, y2);
	}

	public DIEM diemA() {
		DIEM diem = new DIEM();
		System.out.println("Moi ban nhap vao Xa = ");
		diem.setX(sc.nextDouble());
		System.out.println("Moi ban nhap vao Ya = ");
		diem.setY(sc.nextDouble());
		return diem;
	}

	public DIEM diemB() {
		DIEM diem = new DIEM();
		System.out.println("Moi ban nhap vao Xb = ");
		diem.setX(sc.nextDouble());
		System.out.println("Moi ban nhap vao Yb");
		diem.setX(sc.nextDouble());
		return diem;
	}

	public DIEM getA() {
		return a;
	}

	public void setA() {
		this.a = diemA();
	}

	public DIEM getB() {
		return b;
	}

	public void setB() {
		this.b = diemB();
	}

	public double tinhDoDaiAB() {
		return Math.sqrt(Math.pow((b.getX() - a.getX()), 2) + Math.pow((b.getY() - a.getY()), 2));
	}

	@Override
	public String toString() {
		return "Diem A: " + "\n" + a.toString() + "\n" + "Diem B: " + "\n" + b.toString() + "Do dai AB: "
				+ tinhDoDaiAB();
	}

}
