/**
 * Write a program to count the number of negative and postive and zero elements in an array.
 */
package Arrays;

import java.util.Scanner;

/**
 * 
 */
public class program25 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of an array:");
		int n = sc.nextInt();
		
		int arr[]=new int [n];
		
		System.out.println("Enter the element: ");
		for(int i =0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		
		int postive=0;
		int negative=0;
		int zero=0;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>0) {
				postive++;
			}
			else if(arr[i]<0) {
				negative--;
			}
			else {
				zero++;
			}
		}
		
		System.out.println("Postive value in Array are "+postive);
		System.out.println("Negative value in Array are "+negative);
		System.out.println("Zeros value in Array are "+zero);
		
		sc.close();
	}

}
