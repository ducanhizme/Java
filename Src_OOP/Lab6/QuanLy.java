package Lab6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class QuanLy {
    List<TULANH> dsmh = new ArrayList<>();
    //	TULANH dsmh[ ]= new TULANH[10];
    

    public QuanLy(ArrayList<TULANH> dsmh) {
        this.dsmh = dsmh;
    }

    public QuanLy() {
    }

    //	public void nhapDS() {
//		tl.nhapTuLanh();
//		this.dsmh.add(tl);
//	}
    public void nhapDS(TULANH tl) {
        this.dsmh.add(tl);
    }

    public void nhapDS() {
        while (true) {
            TULANH tl = new TULANH();
//			TULANH tl = new TULANH(tenHang, maHang, nuocSX, dungTich, mauSac, hangSX, soLuong, soLuong);
            tl.nhapTuLanh();
            dsmh.add(tl);
            System.out.println("Ban co muon tiep tuc nhap(1=co,0=khong");
            String luachon = new Scanner(System.in).nextLine();
            if (luachon.equalsIgnoreCase("0")) {
                break;
            }
        }
    }

    //	public void hienDS() {
//		for(int i =0; i < dsmh.size();i++) {
//			System.out.println(dsmh.get(i));
//		}
//	}
//	public void hienDS() {
//		dsmh.stream().forEach((tl) -> {
//            tl.hienTuLanh();
//		});
//	}
    public void hienDS() {
        for (TULANH info : dsmh) {
            System.out.println(info);
        }
    }

    public void lietKeTheoHangSanXuat(String hangsx) {
        TULANH tl = new TULANH();
        for (TULANH element : dsmh) {
            if (tl.getHangSX().equalsIgnoreCase(hangsx)) {
                System.out.println(element);
            }
        }
    }

    public float tinhTongTien() {
        float total = 0;
        for (TULANH each : dsmh) {
            total += each.thanhtien();
        }
        return total;
    }

    public void dungTich200L() {
        for (TULANH dungtich : dsmh) {
            if (dungtich.getDungTich() > 200) {
                System.out.println(dungtich);
            }
        }
    }

    public void sapXepGiamDan() {
        for (TULANH ss : dsmh) {
            int i = 0;
            if (dsmh.get(i).getSoLuong() > dsmh.get(i + 1).getSoLuong()) {
                Collections.swap(dsmh, i, i + 1);
            }
            i++;
            System.out.println(ss);
        }

    }

}
