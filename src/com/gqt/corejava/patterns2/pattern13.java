package com.gqt.corejava.patterns2;

import java.util.Scanner;

public class pattern13 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size:");
		 int n = sc.nextInt();

	        for (int i = 1; i <= n; i++) {//5
	            
	            for (int j = 1; j <= n - i; j++) {
	                System.out.print("  "); 
	            }

	        
	            for (int k = 1; k <= i; k++) {
	                System.out.print(i+ " ");
	            }

	            for (int k = i - 1; k >= 1; k--) {
	                System.out.print(i + " ");
	            }
	          

	            System.out.println(); 
	        }

	        sc.close();
	}
}
