/**
 * 
 */
package Arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 */
public class program15 {

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
		boolean isFind = false;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==k) {
				System.out.println("index of the "+k+" value is "+i);
				isFind = true;
			}
		}
		
		if(isFind) {
			System.out.println();
		}
		else {
		System.out.println("value not found in array");
		}
		
		sc.close();
	}

}
