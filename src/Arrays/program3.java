/**
 * write a program to copy elements from one array to another
 */
package Arrays;

import java.util.Scanner;

/**
 * 
 */
public class program3 {

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
		
		int arr1[]= new int[n];
		
		for(int i=0; i<arr1.length; i++) {
			arr1[i]=arr[i];
		}
		
		System.out.println("Copied array is ");
		for(int i=0; i<arr1.length; i++) {
			System.out.print(arr1[i]+" ");
		}
		
		sc.close();
	}
}
