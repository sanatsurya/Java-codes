package array.list_1d_2d_md;
import java.util.Arrays;

public class ArraysSort {
	public static int search(int array[], int key) {
		for(int i=0; i<array.length; i++) {
			if(array[i]==key)
				return i;
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a1[] = new int[] { 5, 7, 9, 8, 4, 3, 2, 1 };
		for (int i = 0; i < a1.length; i++) {
			System.out.print(a1[i]);
		}
		Arrays.sort(a1);
		System.out.println();
		for (int i=0; i<a1.length; i++) {
			System.out.print(a1[i]);//This is used to short a number
		}
		int indexValue = search(a1,9);
		if(indexValue == -1)
			System.out.println("Elements is not found");
		else
			System.out.println("Element is found and is at index" + indexValue);
	}

}
