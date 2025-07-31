/**
 * 
 */
package Arrays;

import java.util.Scanner;

/**
 * 
 */
public class program11 {

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
		
		int sum=0;
		for(int i=0; i<a.length; i++) {
			if(a[i]>0) {
				sum+=a[i];
			}
		}
		System.out.println("Sum of postive numbers in Array is:"+sum);

		sc.close();
	}

}
