/**
 * write a program to sort an array in ascending or descending order.
 */
package Arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 */
public class program6 {

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
		
		Arrays.sort(arr);
		System.out.print("Array in ascending order ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		System.out.print("Array in descending order ");
		System.out.print("[");
		for(int i=arr.length-1; i>=0; i--) {
			System.out.print(arr[i]+",");
		}
		System.out.print("]");
		sc.close();
	}

}
