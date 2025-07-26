package com.gqt.corejava.patterns2;

import java.util.Scanner;

public class pattern9 {

	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		
//		System.out.println("Enter size");
//		int n=sc.nextInt();
		int n=5;
		
		for(int i=1; i<=n; i++) {
			
			for(int k=1; k<=n-i; k++) {
				System.out.print("	");
			}
			
			for(int j=1; j<=n; j++){
				if(i+j==n+1) {
					System.out.print(i);
				}
			}
			
			
			
			
			System.out.println();
		}
		sc.close();
	}
}
