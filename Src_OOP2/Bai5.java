
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class Bai5 {
	public static boolean isPrime(int n){
        if (n <= 1)
            return false;
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;
        return true;
    }
	public static void printArray(int [][] a,int row,int col){
	    for (int i = 0; i < row; i++) {
	        for (int j = 0; j < col; j++) {
	            System.out.print(a[i][j] + "\t");
	        }
	        System.out.println("");
	    }
	}
	public static int maxPrimeCol(int[][] a,int row,int col) {
		int maX=0;
		int column = 0;
		for (int i = 0; i < row; i++) {
			int count =0;
	        for (int j = 0; j < col; j++) {
	            if(isPrime(a[j][i]))
	            	count++;
	        }	
	        if(count>maX) {
	           maX = count;
	           column = i;	
	        }
	        
	    }
		return column;
	}
	public static void sortCol(int[][] a,int row,int col) {
		Arrays.sort(a, (a1, a2) -> a1[0] - a2[1]);
		printArray(a, row, col);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so dong: ");
		int row = sc.nextInt();
		System.out.println("Nhap so cot: ");
		int col = sc.nextInt();
		int[][] a = new int[row][col];
		for (int i = 0; i < row; i++) {
	        for (int j = 0; j < col; j++) {
	            System.out.print("[" + i + ", " + j + "]: ");
	            a[i][j] = sc.nextInt();
	        }
	    }
		System.out.println("---Input Array---");
		printArray(a, row, col);
		List<Integer> list = new ArrayList<>();
		for(int i=0;i<row;i++)
		    for(int j=0;j<col;j++)
		        list.add(a[i][j]);
		Integer mIn =Collections.min(list);
		System.out.println("The index of Minimum :"+list.indexOf(mIn));
		System.out.println("---Fill 0 for non-prime element---");
		for(Integer each : list) {
			if(!isPrime(each)) {
				each = 0;
			}
			System.out.println(each);
		}
		System.out.println("---Sort Column---");
		sortCol(a, row, col);
		System.out.println("The index of Column with most of Prime:" + maxPrimeCol(a, row, col) );
		
	}
}

