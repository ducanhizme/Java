package Lab4;

import java.util.ArrayList;

public class QLDT {
	ArrayList<DOANTHANG> DSDT;

	public QLDT() {
		this.DSDT = new ArrayList<DOANTHANG>();
	}

	public QLDT(ArrayList<DOANTHANG> dSDT) {
		this.DSDT = dSDT;
	}

	public DOANTHANG nhapToaDo() {
		DOANTHANG dt = new DOANTHANG();
		System.out.println("Diem A: ");
		dt.setA();
		System.out.println("Diem B: ");
		dt.setB();
		return dt;
	}

	public void nhapDoanThang() {
		this.DSDT.add(nhapToaDo());
	}

	public void hienDoanThang() {
		for (DOANTHANG info : DSDT) {
			System.out.println(info);
		}
	}

	public void hienDoDaiMax() {
		double maX = DSDT.get(0).tinhDoDaiAB();
		for (DOANTHANG info : DSDT) {
			if (info.tinhDoDaiAB() > maX) {
				System.out.println(info);
			}
		}
	}

	public double tinhTongDoDai() {
		double total = 0;
		for (DOANTHANG element : DSDT) {
			total += element.tinhDoDaiAB();
		}
		return total;
	}
}
