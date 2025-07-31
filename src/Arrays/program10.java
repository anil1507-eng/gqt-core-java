/**
 * 
 */
package Arrays;

import java.util.Scanner;

/**
 * 
 */
public class program10 {

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
		
		int m=n/2; //2
		boolean isboolean = false;
		
		int i=0;
		while(i<m) {
			if(a[i] == a[n-1-i]) {
				isboolean = true;
			}
			else {
				break;
			}
			i++;
		}
		
		if(isboolean) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("not a palindrome");
		}
		
		sc.close();
	}

}
