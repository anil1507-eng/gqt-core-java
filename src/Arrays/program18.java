/**
 * 
 */
package Arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 */
public class program18 {

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
		
		int arr1[]=new int[n];
		
		System.out.println("Enter the elements: ");
		for(int i=0; i<arr1.length; i++) {
			arr1[i]=sc.nextInt();
		}
		
		boolean isEqual=Arrays.equals(arr,arr1);
		
		System.out.println("Arrays are Equal : "+isEqual);

	}

}
