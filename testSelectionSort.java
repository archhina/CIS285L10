package lab9package;
/*
* testSelectionSort.java
*
* To change this template, choose Tools | Template Manager
* and open the template in the editor.
*/
import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;
public class testSelectionSort {
@Test
public void test() {
testPositive();
testNegative();
testMixed();
testDuplicates();
}
		public testSelectionSort() {
		}
		public void testPositive(){
		int[] arr = new int[5];
		arr[0] = 8;
		arr[1] = 9;
		arr[2] = 7;
		arr[3] = 10;
		arr[4] = 2;
		SelectionSort temp1 = new SelectionSort();
		int[] newarr = temp1.basicSelectionSort(arr);
		int[] Sortedarr = new int[5];
		Sortedarr[0] = 2;
		Sortedarr[1] = 7;
		Sortedarr[2] = 8;
		Sortedarr[3] = 9;
		Sortedarr[4] = 10;
		System.out.println("Test Positive: ");
		System.out.println(java.util.Arrays.toString(newarr));
		for (int i = 0; i < 5; ++i) {
			assertEquals("Output is incorrect. Sorted array should match Sortedarr", Sortedarr[i],
		newarr[i]);
		}
	}

	public void testNegative(){
		int[] arr = new int[5];
		arr[0] = -8;
		arr[1] = -9;
		arr[2] = -7;
		arr[3] = -10;
		arr[4] = -2;
		SelectionSort temp1 = new SelectionSort();
		int[] newarr = temp1.basicSelectionSort(arr);
		int[] Sortedarr = new int[5];
		Sortedarr[0] = -10;
		Sortedarr[1] = -9;
		Sortedarr[2] = -8;
		Sortedarr[3] = -7;
		Sortedarr[4] = -2;
		System.out.println("Test Negative: ");
		System.out.println(java.util.Arrays.toString(newarr));
		for (int i = 0; i < 5; ++i) {
			assertEquals("Output is incorrect. Sorted array should match Sortedarr", Sortedarr[i],
		newarr[i]);
		}
	}

	public void testMixed(){
		int[] arr = new int[5];
		arr[0] = -8;
		arr[1] = 9;
		arr[2] = -7;
		arr[3] = 10;
		arr[4] = -2;
		SelectionSort temp1 = new SelectionSort();
		int[] newarr = temp1.basicSelectionSort(arr);
		int[] Sortedarr = new int[5];
		Sortedarr[0] = -8;
		Sortedarr[1] = -7;
		Sortedarr[2] = -2;
		Sortedarr[3] = 9;
		Sortedarr[4] = 10;
		System.out.println("Test Mixed: ");
		System.out.println(java.util.Arrays.toString(newarr));
		for (int i = 0; i < 5; ++i) {
			assertEquals("Output is incorrect. Sorted array should match Sortedarr", Sortedarr[i],
			newarr[i]);
		}
	}

	public void testDuplicates(){
		int[] arr = new int[5];
		arr[0] = 1;
		arr[1] = 1;
		arr[2] = -4;
		arr[3] = -4;
		arr[4] = 5;
		SelectionSort temp1 = new SelectionSort();
		int[] newarr = temp1.basicSelectionSort(arr);
		int[] Sortedarr = new int[5];
		Sortedarr[0] = -4;
		Sortedarr[1] = -4;
		Sortedarr[2] = 1;
		Sortedarr[3] = 1;
		Sortedarr[4] = 5;
		System.out.println("Test Duplicates: ");
		System.out.println(java.util.Arrays.toString(newarr));
		for (int i = 0; i < 5; ++i) {
			assertEquals("Output is incorrect. Sorted array should match Sortedarr", Sortedarr[i],
			newarr[i]);
		}
	}
}