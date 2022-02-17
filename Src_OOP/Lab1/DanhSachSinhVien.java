package Lab1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class DanhSachSinhVien {
	ArrayList<SinhVien> dssv;
	SinhVien[] dssh;
	int total =0;
	int i =0;
	public DanhSachSinhVien() {
		this.dssv = new ArrayList<SinhVien>();
	}

	
	
	public DanhSachSinhVien(ArrayList<SinhVien> dssv) {
		this.dssv = dssv;
	}
	
	public void addStudents(SinhVien sv) {
		this.dssv.add(sv);
	}
	public void showInfoStudents() {
		for(SinhVien info : dssv) {
			System.out.println(info);
		}
	}
	public int totalCostOfMeals() {
		for(SinhVien element : dssv) {
			total += (element.numberOfMeals*25000);
		}
		return total;
	}
	public void showMoney() {
		int i=0;
		for(SinhVien money : dssv) {
			System.out.println("Money of Meals "+i+":" + money.getTienan());
			i++;
		}
	}
	public void showInfo20Meals() {
		for(SinhVien number : dssv) {
			if(number.numberOfMeals > 20) {
				System.out.println(number);
			}
		}
	}
	public void sort() {
		for(SinhVien info : dssv) {
			int i =0;
			if(dssv.get(i).compare(dssv.get(i+1))) {
				Collections.swap(dssv,i,i+1);
			}
			i++;
		}
	}
	
}


