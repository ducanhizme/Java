package Lab3;

import java.util.Scanner;

public class DSCN {
	Congnhan dscn[];
	int n;

	public void nhapSCN() {
		Scanner in = new Scanner(System.in);
		System.out.println("Nhap vao cong nhan: ");
		n = in.nextInt();
		dscn = new Congnhan[n];
	}
	
	public boolean checkN() {
		return (n > 0 && n < 260);
	}

	public void nhapDSCN() {
		for (int i = 0; i < n; i++) {
			dscn[i] = new Congnhan();
			dscn[i].NhapCongNhan();
		}
	}
	public void HienDSCN() {
		for (int i = 0; i < n; i++) {
			dscn[i].HienCongNhan();
		}
	}
	public void HienDSCNDK(int luong) {
		for (int i = 0; i < n; i++) {
			if (dscn[i].tinhluong() > luong) {
				System.out.println(dscn[i].getHoten());
			}
		}
		
	}
}
