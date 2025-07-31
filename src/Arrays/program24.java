/**
 * write a program to find the kth smallest and kth largest numbers in an array.
 */
package Arrays;


import java.util.Scanner;
import java.util.Arrays;

/**
 * 
 */
public class program24 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size: ");
		int n = sc.nextInt();
		
		int arr[]=new int[n];
		
		System.out.println("Enter the elements: ");
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.print("Enter the Kth element: ");
		int k = sc.nextInt();
		
		Arrays.sort(arr);
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]);
		}
		System.out.println("kth smallest element is "+arr[k-1]);
		System.out.println("kth smallest element is "+arr[arr.length-k]);
		
		sc.close();
	}

}
