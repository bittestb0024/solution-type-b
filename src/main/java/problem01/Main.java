package problem01;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		int[] arr = { -10, -3, 5, 6, -20 };
		findMaxProduct(arr);
	}

	public static void findMaxProduct(int[] arr) {
		int maxNumber = arr[0]*arr[1];
		
		List<Integer> a = new ArrayList<Integer>();
		for(int i =0;i<arr.length-1;i++) {
			for(int j =i+1;j<arr.length;j++) {
				if(arr[i]*arr[j]>maxNumber) {
					maxNumber=arr[i]*arr[j];
				}
			}
		}
		for(int i =0;i<arr.length-1;i++) {
			for(int j =i+1;j<arr.length;j++) {
				if(arr[i]*arr[j]==maxNumber) {
					a.add(arr[i]);
					a.add(arr[j]);
				}
			}
		}
	
		System.out.println(a.toString());
	}
}
