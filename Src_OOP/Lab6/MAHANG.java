package Lab6;

import java.util.Scanner;

public class MAHANG {
    protected String tenHang;
    protected int maHang;
    protected String nuocSX;

    public MAHANG() {
    }


    public MAHANG(String tenHang, int maHang, String nuocSX) {
        this.tenHang = tenHang;
        this.maHang = maHang;
        this.nuocSX = nuocSX;
    }


    public void nhap() {

        System.out.println("Nhap vao ten hang: ");
        Scanner in = new Scanner(System.in);
        tenHang = new Scanner(System.in).nextLine();
        System.out.println("Nhap vao ma hang: ");
        Scanner in1 = new Scanner(System.in);
        maHang = new Scanner(System.in).nextInt();
        in1.nextLine();
        System.out.println("Nhap vao nuoc san xuat: ");
        Scanner in2 = new Scanner(System.in);
        nuocSX = new Scanner(System.in).nextLine();
    }

    public void hien() {
        System.out.println("Ten hang: " + tenHang);
        System.out.println("Ma hang: " + maHang);
        System.out.println("Nuoc SX: " + nuocSX);
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public int getMaHang() {
        return maHang;
    }

    public void setMaHang(int maHang) {
        this.maHang = maHang;
    }

    public String getNuocSX() {
        return nuocSX;
    }

    public void setNuocSX(String nuocSX) {
        this.nuocSX = nuocSX;
    }


}
