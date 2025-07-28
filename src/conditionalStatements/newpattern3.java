/**
 * 
 */
package conditionalStatements;

import java.util.Scanner;
/**
*- - - - - $
*- - - - $ $ $
*- - - $ $ $ $ $
*- - $ $ $ $ $ $ $
*- $ $ $ $ $ $ $ $ $
*$ $ $ $ $ $ $ $ $ $ $
*/

/**
 *@author Anil V
 *@category patterns
 *
 */
public class newpattern3 {

	/**
	 * @param args
	 */
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Size:");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			
			for(int j=1; j<=n-i+1; j++) {
				System.out.print("- ");
			}
			
			
//			for(int k=2*i-1; k>=1; k--) {
//				System.out.print("*");
//			}
			
			for(int j=1; j<=2*i-1; j++) {
				System.out.print("$ ");
			}
//			for(int j=n; j>=n-i; j--) {
//				System.out.print("- ");
//			}
			System.out.println("");
		}
		
		sc.close();
	}

}
