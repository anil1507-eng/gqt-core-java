package com.gqt.corejava.patterns2;

import java.util.Scanner;

public class pattern20 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size:");
		 int n = sc.nextInt();

	        for (int i = 1; i <= n; i++) {//5
	            
	            for (int j = 1; j <= n - i; j++) {
	                System.out.print("  "); 
	            }

	        
	            for (int k = 1; k <= i; k++) {
	            	int asciiValue = k+64;

                    char character = (char) asciiValue;

	                System.out.print(character+" ");
	            }

	        	for(int r=2;r<=i;r++) {
	        		int asciiValue = r+63;

                    char character = (char) asciiValue;

	                System.out.print(character+" ");
				}
				System.out.println();
	           
	         
	        }

	        sc.close();
	}
}
