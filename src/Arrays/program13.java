/**
 * 
 */
package Arrays;

import java.util.Scanner;

/**
 * 
 */
public class program13 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n =sc.nextInt();
		
		int a[] = new int[n];
		
		
		System.out.println("Enter the elements into the array: ");
		for(int i=0; i<a.length; i++) {
			a[i]=sc.nextInt();	
		}
		
		int product=1;
		for(int i=0; i<a.length; i++) {
			
				product=product*a[i];
		
		}
		System.out.println("Product of numbers in Array is:"+product);

		sc.close();

	}

}
