/**
 * write a program to find largest and smallest elements in an array.
 */
package Arrays;

import java.util.Scanner;

/**
 * 
 */
public class program2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n =sc.nextInt();
		
		int arr[] = new int[n];
		System.out.println("Enter the elements into the array: ");
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		int max=arr[0];
		int min=arr[0];
		
		for(int i=0; i<arr.length; i++) {
			if( max<arr[i]) max=arr[i];
			if( min>arr[i]) min=arr[i];
		}
		System.out.println("Maximum element in array is "+max);
		System.out.println("Minimum element in array is "+min);

		sc.close();
	}

}
