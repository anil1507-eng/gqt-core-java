package com.gqt.corejava.patterns;

import java.util.Scanner;

public class pattern21 {
	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("enter the size:");
		int n = sc.nextInt();
		
		for( int i =n; i>=1;i--) {
			for( int j =1;j<=i;j++) {
				System.out.print("- ");
			}
			for( int j=n; j>=i;j--) {
				System.out.print("# ");
			}
			System.out.println();
		}
		sc.close();
	}
}
