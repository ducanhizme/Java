
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Bai1 {
	public static boolean isPrime(int n){
        if (n <= 1)
            return false;
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;
        return true;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("Nhap vao n: ");
		n= sc.nextInt();
		ArrayList<Integer> arr = new ArrayList<>(n);
		for(int i =0;i<n;i++) {
			int element = sc.nextInt();
			arr.add(element);
		}
		System.out.println("--Inputed Array--");
		arr.stream().forEach(e->{System.out.print(e+" ");});
		System.out.println("");
		Integer mIn =arr.stream().min(Integer::compare).get();
		System.out.println("-----------------");
		System.out.println("Min:"+mIn);
		Integer mAx =arr.stream().max(Integer::compare).get();
		System.out.println("Max:"+mAx);
		System.out.println("--Prime Numbers--");
		arr.stream().forEach(e->{
			if(isPrime(e)) {
				System.out.print(e+" ");
			}
		});
		System.out.println("");
		System.out.println("---Sorted Array--");
			Collections.sort(arr);
			arr.stream().forEach(e->{System.out.print(e+" ");});
		}
}
