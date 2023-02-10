import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
	int X; 
	
	Scanner scnr = new Scanner(System.in);
	X = scnr.nextInt();
	
	int[] array = {10,5,2,8,4,9,6,7,1};
	
	int index = linearSearch(array, X);
	

	
	
	if(index != -1) {
		System.out.println("Found Element at index: " + index);
	}
	else {
		System.out.println("Element was not found");
	}
	
}

	private static int linearSearch(int[] array, int value) {
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] == value) {
				return i;
			}
			 
		}
		return -1;
	}

}
