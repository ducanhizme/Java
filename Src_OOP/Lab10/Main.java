package Lab10;

public class Main {
	public static void main(String[] args) {
		System.out.println("Nhap vao thong tin cac xe: ");
		Manage mgm = new Manage();
		mgm.input();
		System.out.println("Hien thong tin cac xe: ");
		mgm.show();
	}
}
