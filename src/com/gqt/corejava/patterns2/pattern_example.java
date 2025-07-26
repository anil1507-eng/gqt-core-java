package com.gqt.corejava.patterns2;

import java.util.Scanner;

public class pattern_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter size");
//		int n=sc.nextInt();
		int n=5;
		
		for(int i=1; i<=n; i++) {
			
			for(int j=n/2; j<=n*2; j++) {
				if(i == j) {
					System.out.print(i);
				}
				else {
					System.out.print("	");
				}
			}
			System.out.println();
		}
		sc.close();
	}

}
