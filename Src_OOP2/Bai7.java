import java.util.Scanner;
import java.util.StringTokenizer;
public class Bai7 {
	public static void CharacterAppearOnceTime(char arr[]) {
		int count[];
		count = new int[256];
		for (int i =0; i < 256; i++) {
			count[i] = 0;
		}
		int len = arr.length;
		for (int i=0; i < len; i++) {
			count[arr[i]]++;
			if (count[arr[i]]==1) {
				System.out.print(arr[i]);
			}
		}
	}

	
	
	public static void main(String[] args) {
		System.out.println("Nhap vao chuoi: ");
		String str = new Scanner(System.in).nextLine();
		char a[]= str.toCharArray();
		CharacterAppearOnceTime(a);
	}
}
