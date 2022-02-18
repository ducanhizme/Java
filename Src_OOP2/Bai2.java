import java.util.Map;
import java.util.Map.Entry;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Bai2 {
	public static void checkNumberAppear1Time(ArrayList<Integer> arr ,int n) {
		Map<Integer, Integer> m = new HashMap<Integer,Integer>();
		for(int i =0;i<n;i++) {
			if(!m.containsKey(arr.get(i))) 
				m.put(arr.get(i),0);//First time put into map -> element mapped(key: element , value:0)
			m.put(arr.get(i), m.get(arr.get(i))+1);
			//Second time put into map but the value will change( 1: Appear once, another number: Appear many time )			
		}
		for(Entry<Integer,Integer> entry : m.entrySet() ) {
			if(entry.getValue()==1) {
				System.out.println(entry.getKey());
			}
		}
		
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap vao mang: ");
		int n = sc.nextInt();
		ArrayList<Integer> arr1 = new ArrayList<>(n);
		for(int i =0;i<n;i++) {
			int element = sc.nextInt();
			arr1.add(element);
		}
		System.out.println("mang da nhap: ");
		arr1.stream().forEach(e->{System.out.print(e+" ");});
		System.out.println("");
		checkNumberAppear1Time(arr1, n);
	}
}

