/**
 * 
 */
package conditionalStatements;

import java.util.Scanner;

/**
 * pattern printing using conditional loops
 * 
 * #
 * # #
 * # - #
 * # - - #
 * # # # # #
 */
public class newpattern2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size : ");
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<=i; j++) {
				if( j==0 || i==(n-1) || (i==j)) {
					System.out.print("# ");
				}
				else {
					System.out.print("- ");
				}
			}
			System.out.println();
		}
		sc.close();
	}

}
