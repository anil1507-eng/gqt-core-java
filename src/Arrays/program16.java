/**
 * 
 */
package Arrays;

import java.util.Scanner;

/**
 * 
 */
public class program16 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n =sc.nextInt();
		
		int a[] = new int[n];
		int or[]=new int[n];
		
		
		System.out.println("Enter the elements into the array: ");
		for(int i=0; i<a.length; i++) {
			a[i]=sc.nextInt();
		}
		
		for(int i=0; i<a.length; i++) {
			or[i]=a[i];
		}
		
		System.out.println("Enter the rotation of postions : ");
		int m =sc.nextInt();
		
		for(int i =0; i<m; i++) {
			int last = a[a.length-1];
			
			for(int j=a.length-1; j>0;j--) {
				a[j]=a[j-1];
				
			}
			
			a[0]=last;
		}
		
		System.out.println("after right rotating the Array is ");
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+" ");
		}
		
		System.out.println();
		
		for(int i=0; i<m; i++) {
			int first = or[0];
			
			for(int j=1; j<or.length; j++) {
				or[j-1]=or[j];
			}
			
			 or[or.length-1]=first;
		}
		
		System.out.println("after left rotating the Array is ");
		for(int i=0; i<or.length; i++) {
			System.out.print(or[i]+" ");
		}
		
	 sc.close();
	}

}
