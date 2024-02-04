package chapter7;

import java.util.Arrays;

public class TestCode {
	public static void main(String[] args) {
//		int[] arr = new int[3];
//		int[] arr2 = new int[] {1,2,3};
//		
//		int[] arr3;
//		arr3 = new int[4];
//
//		int[] arr4;
//		arr4 = new int[] {1,2,3,4};
//
//		int[] arr5 = null;
//		System.out.println(Arrays.toString(arr));
//		System.out.println(Arrays.toString(arr2));
//		System.out.println(Arrays.toString(arr3));
//		System.out.println(Arrays.toString(arr4));
////		
////		System.out.println(arr5);
//		byte byteValue = 10;
//		byte result = (byte) (byteValue + byteValue);
		int max = 0;
		int[] arr = {1,2,34};
		for (int i = 0 ; i<arr.length;i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println(max);
	}
}
