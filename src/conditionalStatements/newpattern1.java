/**
 * 
 */
package conditionalStatements;

import java.util.Scanner;

/**
 * @author Anil V
 * @category patterns
 * @description this class contain the pattern using conditional programming
 * 
 * # # # # #
 * # - - - #
 * # - - - #
 * # - - - #
 * # # # # #
 * 
 */
public class newpattern1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 5;
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if( i==0 || i==(n-1) || j==0 || j==(n-1)) {
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
