/**
 * write a program to remove duplicate elements from an array.
 */
package Arrays;


import java.util.Scanner;

/**
 * 
 */
public class program4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n =sc.nextInt();
		
		int arr[] = new int[n];
		System.out.println("Enter the elements into the array: ");
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		
		
        int[] unique = new int[n];
        int uniqueCount = 0;

        

        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;

            for (int j = 0; j < uniqueCount; j++) {
                if (arr[i] == unique[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            

  
            if (!isDuplicate) {
                unique[uniqueCount] = arr[i];
                uniqueCount++;
            }
        }

     
        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < uniqueCount; i++) {
            System.out.print(unique[i] + " ");
        }
		
        sc.close();	
	}

}
