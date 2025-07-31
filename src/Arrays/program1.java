/**
 * write a program to find the sum of all elements in an array
 */
package Arrays;

import java.util.Scanner;

/**
 * 
 */
public class program1 {

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
		
		int sum=0;
		for(int i=0; i<arr.length; i++) {
			sum+=arr[i];
		}
		
		System.out.println("Sum of the all elements in Array is "+sum);
		
		sc.close();
	}

}
