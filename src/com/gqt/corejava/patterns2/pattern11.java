package com.gqt.corejava.patterns2;

import java.util.Scanner;

public class pattern11 {
	
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Size:");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			
			
			for(int j=1; j<=n-i; j++) {
				System.out.print(" ");
			}
			for(int k=i; k>=1; k--) {
				
				System.out.print("* ");
			}
			
			System.out.println();
		}
		
		sc.close();
	}
}
