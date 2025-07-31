/**
 * write a program to print the frequency numbers in arrays. 
 */
package Arrays;

import java.util.Scanner;

/**
 * 
 */
public class program7 {


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n =sc.nextInt();
		
		int arr[] = new int[n];
		boolean visited[]=new boolean[n];
		System.out.println("Enter the elements into the array: ");
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
			visited[i]=false;
		}
		
		
		System.out.println("\nElement\tFrequency");
        for (int i = 0; i < n; i++) {
            if (visited[i] == true)
                continue;

            int count = 1;

            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = true; 
                }
            }

            System.out.println(arr[i] + "\t" + count);
        }

        sc.close();
		
	
	}

}
