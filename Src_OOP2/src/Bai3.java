import java.util.ArrayList;

import java.util.Collections;
import java.util.Scanner;

public class Bai3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap vao mang: ");
		int n = sc.nextInt();
		ArrayList<Integer> arr = new ArrayList<>(n);
		for(int i =0;i<n;i++) {
			int element = sc.nextInt();
			arr.add(element);
		}
		Collections.sort(arr);
		int anotherElement= sc.nextInt();
		arr.add(anotherElement);
		
	}
}
