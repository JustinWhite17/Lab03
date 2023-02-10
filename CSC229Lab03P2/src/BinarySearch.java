import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
	
	//binary search
	public static void main(String[] args) {
		int X;

		int array[] = new int[1000];
		Scanner scnr = new Scanner(System.in);
		X = scnr.nextInt();
		
		for(int i = 0; i < array.length; i++) {
			array[i] = i;
		}

		int index = binarySearch(array, X);
		
		if(index == -1) {
			System.out.println(X + "was not found");
		}
		else {
			System.out.println("Element was found at: " + index);
		}
	}

	private static int binarySearch(int[] array, int X) {
		
		int low = 0;
		int high = array.length -1;
		
		while(low <= high) {
			
			int middle = low + (high - low) / 2;
			int value = array[middle];
			
			System.out.println("middle: " + value);
			
			if(value < X) low = middle +1;
			else if(value > X) high = middle - 1;
			else return middle;
		}
		return -1;
	}

}
