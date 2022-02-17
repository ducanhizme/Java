package Lab1;


public class SinhVien {
	 String id;
	 String fullName;
	 String className;
	 int numberOfMeals;
	
	 public SinhVien(String id, String fullName, String className, int numberOfMeals) {
		this.id = id;
		this.fullName = fullName;
		this.className = className;
		this.numberOfMeals = numberOfMeals;
	}
	public void nhap() {
		
	}
	

	@Override
	public String toString() {
		return "Ma sinh vien: " + this.id +"\n"+ "Ho va ten: " + this.fullName +"\n"+"Lop: "+this.className+"\n"+"So buoi an ban tru: "+ this.numberOfMeals;
	}
	public int getTienan() {
		return this.numberOfMeals*25000;
	}
	public boolean compare(SinhVien a) {
		return this.getTienan() > a.getTienan();
	}
	
}
