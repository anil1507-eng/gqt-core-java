package com.gqt.corejava.patterns2;

import java.util.Scanner;

public class pattern15 {
 
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size:");
		int n =sc.nextInt();
		
//		int m=1;
		
		for(int i =1;i<=n;i++) {
			for(int j=i;j<n;j++) {
				System.out.print("	");
				
			}
			int m=1;
			for(int k =1;k <= (2*i-1);k++) {
			
				System.out.print(m+"	");
				m++;
			}
			
			System.out.println();
		}
		
		sc.close();
	}
	
}
