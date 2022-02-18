import java.util.Scanner;

public class Bai6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao 1 chuoi: ");
		String str= sc.nextLine();
		char a[]=str.toCharArray();
		String reverse ="";
		for(int i  = a.length-1;i>=0;i--) {
			reverse += (a[i]);
		}
		System.out.println("Reverse string: "+reverse);
		
	}	
}
