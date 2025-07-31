/**
 * 
 */
package Arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 */
public class program14 {

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
		
//		System.out.print("Enter the Kth element: ");
//		int k = sc.nextInt();
		int k=2;
		
		Arrays.sort(arr);
		
//		for(int i=0; i<arr.length; i++) {
//			System.out.print(arr[i]);
//		}
		System.out.println("Second smallest element is "+arr[2-1]);
		System.out.println("Second largest element is "+arr[arr.length-2]);
		
		sc.close();
	}

}
