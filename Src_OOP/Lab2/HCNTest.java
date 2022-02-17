package Lab2;

import java.util.Scanner;

public class HCNTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HCN hcn = new HCN();
		System.out.println("Nhap vao chieu dai: ");
		double cd ;
		hcn.setLength(cd= sc.nextDouble());
		System.out.println("Nhap vao chieu rong: ");
		double cr ;
		hcn.setWitdh(cr= sc.nextDouble());
		double area = hcn.caculateArea();
		double perimeter = hcn.caculatePerimeter();
		System.out.println("Dien tich: "+ area);
		System.out.println("Chu vi: "+ perimeter);
		System.out.println(hcn);
	}
}
