package com.gqt.corejava.patterns2;

import java.util.Scanner;

public class pattern6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size:");
		int n =sc.nextInt();
//		int m=1;
		
		for(int i =1;i<=n;i++) {
			for(int j=i;j<n;j++) {
				System.out.print("	");
				
			}
			for(int k =1;k <= (2*i-1);k++) {
				System.out.print(k+"	");

			}
			
			System.out.println();
		}
		
		sc.close();
	}

}
