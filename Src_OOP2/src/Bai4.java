import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Bai4 {
	public static void inputArray(int arr[], int SIZE) {
		Scanner in = new Scanner(System.in);

		for (int i = 0; i < SIZE; i++) {
			arr[i] = in.nextInt();
		}
	}

	public static void printArray(int arr[], int SIZE) {
		System.out.println(Arrays.toString(arr));
	}

	public static void sortArray(int[] arr) {
		Arrays.sort(arr);
	}

	public static void mergeSorted(int arrA[],int arrB[]) {
		int length = arrA.length + arrB.length;
		int[]arr = new int[length];
		int i =0;
		int j=0;
		
		for(int each : arrA) {
			arr[i]= each;
			i++;
		}
		
		for(int element : arrB) {
			arr[j]= element;
			j++;
		}
		sortArray(arr);
		System.out.println(Arrays.toString(arr));
		
//		int i =0;
//		int j=0;
//		for(int k =0;k<SIZE;k++) {
//			if(i<SIZE_a && i<SIZE_b) {
//				if(arrA[i]<=arrB[j]) {
//					arr[k]=arrA[i];
//					i++;
//				}else {
//					arr[k]=arrB[i];
//					j++;
//				}
//			}else if(i<SIZE_a) {
//					arr[k]=arrA[i];
//					i++;
//			}else if(j<SIZE_b){
//				arr[k]=arrB[i];
//				j++;
//			}
//		}
	}

	public static void main(String[] args) {
		int a[];
		int b[];

		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao do rong mang A: ");
		int SIZE_a = sc.nextInt();
		a = new int[SIZE_a];
		inputArray(a, SIZE_a);
		printArray(a, SIZE_a);
		sortArray(a);
		System.out.println("Nhap vao do rong mang B: ");
		int SIZE_b = sc.nextInt();
		b = new int[SIZE_b];
		inputArray(b, SIZE_b);
		printArray(b, SIZE_b);
		sortArray(b);
		mergeSorted( a, b);

	}
}
