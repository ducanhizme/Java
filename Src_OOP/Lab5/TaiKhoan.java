package Lab5;

public class TaiKhoan {
	private int stk;
	private String tenStk;
	private double soTien;
	private double laiSuat = 0.05;


	public TaiKhoan(int stk, String tenStk, int soTien, double laiSuat) {
		this.stk = stk;
		this.tenStk = tenStk;
		this.soTien = soTien;
		this.laiSuat = laiSuat;
	}

	public int getStk() {
		return stk;
	}

	public void setStk(int stk) {
		this.stk = stk;
	}

	public String getTenStk() {
		return tenStk;
	}

	public void setTenStk(String tenStk) {
		this.tenStk = tenStk;
	}

	public double getSoTien() {
		return soTien;
	}

	public void setSoTien(int soTien) {
		this.soTien = soTien;
	}

	public double getLaiSuat() {
		return laiSuat;
	}

	public void setLaiSuat(double laiSuat) {
		this.laiSuat = laiSuat;
	}
	
	public double  guiTienVao(double napTien) {
		this.soTien = this.soTien + napTien;
		return this.soTien;
	}
	
	public double rutTien(double tienRut) {
		int phiRutTien =2000;
		this.soTien = this.soTien - (tienRut+phiRutTien);
		return this.soTien;
	}
	
	public double daoHan() {
		this.soTien = this.soTien +this.soTien* this.laiSuat;
		return this.soTien;
	}

}
