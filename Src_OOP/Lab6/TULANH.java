package Lab6;

import java.util.Scanner;

public class TULANH extends MAHANG {
    private int dungTich;
    private String mauSac;
    private String hangSX;
    private int soLuong;
    private float donGia;
    MAHANG mh = new MAHANG();

    public TULANH(int dungTich, String mauSac, String hangSX, int soLuong, float donGia) {
        this.dungTich = dungTich;
        this.mauSac = mauSac;
        this.hangSX = hangSX;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public TULANH(String tenHang, int maHang, String nuocSX, int dungTich, String mauSac, String hangSX, int soLuong,
                  float donGia) {
        super(tenHang, maHang, nuocSX);
        this.dungTich = dungTich;
        this.mauSac = mauSac;
        this.hangSX = hangSX;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public TULANH() {
    }


    public int getDungTich() {
        return dungTich;
    }

    public void setDungTich(int dungTich) {
        this.dungTich = dungTich;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    public String getHangSX() {
        return hangSX;
    }

    public void setHangSX(String hangSX) {
        this.hangSX = hangSX;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public float getDonGia() {
        return donGia;
    }

    public void setDonGia(float donGia) {
        this.donGia = donGia;
    }

    public void nhapTuLanh() {
        super.nhap();
//		Scanner sc = new Scanner(System.in);
        System.out.println("Nhap dung tich: ");
//		Scanner sc = new Scanner(System.in);
        dungTich = new Scanner(System.in).nextInt();
        System.out.println("Nhap mau sac: ");
//		Scanner sc1 = new Scanner(System.in);
        mauSac = new Scanner(System.in).nextLine();
        System.out.println("Nhap hang san xuat: ");
//		Scanner sc2 = new Scanner(System.in);
        hangSX = new Scanner(System.in).nextLine();
        System.out.println("Nhap so luong: ");
//		Scanner sc3 = new Scanner(System.in);
        soLuong = new Scanner(System.in).nextInt();
        System.out.println("Nhap don gia: ");
//		Scanner sc4 = new Scanner(System.in);
        donGia = new Scanner(System.in).nextFloat();
    }

    public float thanhtien() {
        return this.soLuong * this.donGia;
    }

    public void hienTuLanh() {
        super.hien();
        System.out.println("Dung tich: " + dungTich);
        System.out.println("Mau sac: " + mauSac);
        System.out.println("Hang SX: " + hangSX);
        System.out.println("So luong " + soLuong);
        System.out.println("Don gia: " + donGia);
    }

    
    

}
