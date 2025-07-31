/**
 * 
 */
package Arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 */
public class program8 {

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
		
		int b[] = new int[n];
		
		
		System.out.println("Enter the elements into the array: ");
		for(int i=0; i<b.length; i++) {
			b[i]=sc.nextInt();
		}
		
		int m[]=new int[a.length+b.length];
		
		for(int i=0; i<a.length; i++) {
			m[i]=a[i];
		}
		
		int k=n;
		for(int j=0; j<b.length; j++) {
			m[k] = b[j];
			k++;
		}
		
	   Arrays.sort(m);

	   System.out.println();
	   System.out.println("Merge array is :");
		for(int i=0; i<m.length; i++) {
			System.out.print(m[i]+" ");
		}
		
		sc.close();
	}

}
