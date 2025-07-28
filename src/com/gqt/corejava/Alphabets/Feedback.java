/**
 * 
 */
package com.gqt.corejava.Alphabets;

import java.util.Scanner;

/**
 * 
 */
public class Feedback {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Size:");
		int n = sc.nextInt();
		
		System.out.println();
		System.out.println();
		
		for(int i=0; i<n; i++) {
			
			//A
			for(int j=0; j<n; j++) {
				if(i==0 && j!=0 && j!=n-1 || j==0 && i!=0 || j==n-1 && i!=0 || i == (n/2) ) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print(" ");
			System.out.print(" ");
			
			//P
			for(int j=0; j<n; j++) {
				if( j==0|| i ==0 && j<n-1 || j == n-1 && i<5 && i>0 || i == n/2 && j<n-1 ) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print(" ");
			System.out.print(" ");
			
			//P
			for(int j=0; j<n; j++) {
				if( j==0|| i ==0 && j<n-1 || j == n-1 && i<5 && i>0 || i == n/2 && j<n-1 ) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print(" ");
			System.out.print(" ");
			
			//R
			for(int j=0; j<n; j++) {
				if( j==0|| i ==0 && j<n-1 || j == n-1 && i<5 && i>0 || i == n/2 && j<n-1 || i==j && j>=5 && i >=5 ) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print(" ");
			System.out.print(" ");
			
			
			//E
			for(int j=0; j<n; j++) {
				if(i==0 || i==n-1 || j==0 || i==n/2 ) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print(" ");
			System.out.print(" ");
			
			//C
			for(int j=0; j<n; j++) {
				if(i==0 || i==n-1 || j==0  ) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print(" ");
			System.out.print(" ");
			
			//I
			for(int j=0; j<n; j++) {
				if(i==n-1 || i==0 || j==n/2 ) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print(" ");
			System.out.print(" ");
			
			//A
			for(int j=0; j<n; j++) {
				if(i==0 && j!=0 && j!=n-1 || j==0 && i!=0 || j==n-1 && i!=0 || i == (n/2) ) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print(" ");
			System.out.print(" ");
			
			//T
			for(int j=0; j<n; j++) {
				if(i ==0 || j == n/2 ) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print(" ");
			System.out.print(" ");
			
			//E
			for(int j=0; j<n; j++) {
				if(i==0 || i==n-1 || j==0 || i==n/2 ) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("	 ");
			System.out.print("	 ");
			System.out.print("	 ");
			System.out.print(" 		");
			System.out.print("	 ");
			System.out.print("	 ");
			
			
			
			//A
			for(int j=0; j<n; j++) {
				if(i==0 && j!=0 && j!=n-1 || j==0 && i!=0 || j==n-1 && i!=0 || i == (n/2) ) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print(" ");
			System.out.print(" ");
			
			//N
			for(int j=0; j<n; j++) {
				if( j==0 || j == n-1 || i==j) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print(" ");
			System.out.print(" ");
			
			//D
			for(int j=0; j<n; j++) {
				if(i==0 && j!=n-1 || i==n-1 && j!=n-1 || j==0 || j==n-1 && i!=n-1 && i!=0 ) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			
			System.out.print("	 ");
			System.out.print("	 ");
			System.out.print("	 ");
			System.out.print(" 		");
			System.out.print("	 ");
			System.out.print("	 ");
			
			
			//G
			for(int j=0; j<n; j++) {
				if(i==0 || j==0 || i==n-1 && j<=n/2 || j == n/2 && i>=5 || i==n/2 && j>=5 || j==n-1 && i>=5 ) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print(" ");
			System.out.print(" ");
			
			//U
			for(int j=0; j<n; j++) {
				if(j ==0 || i == n-1 || j == n-1) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print(" ");
			System.out.print(" ");
			
			//I
			for(int j=0; j<n; j++) {
				if(i==n-1 || i==0 || j==n/2 ) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print(" ");
			System.out.print(" ");
			
			//D
			for(int j=0; j<n; j++) {
				if(i==0 && j!=n-1 || i==n-1 && j!=n-1 || j==0 || j==n-1 && i!=n-1 && i!=0 ) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print(" ");
			
			//A
			for(int j=0; j<n; j++) {
				if(i==0 && j!=0 && j!=n-1 || j==0 && i!=0 || j==n-1 && i!=0 || i == (n/2) ) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print(" ");
			System.out.print(" ");
			
			//N
			for(int j=0; j<n; j++) {
				if( j==0 || j == n-1 || i==j) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print(" ");
			System.out.print(" ");
			
			//C
			for(int j=0; j<n; j++) {
				if(i==0 || i==n-1 || j==0  ) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print(" ");
			System.out.print(" ");
			
			//E
			for(int j=0; j<n; j++) {
				if(i==0 || i==n-1 || j==0 || i==n/2 ) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print(" ");
			System.out.print(" ");
			
			
			System.out.println();
		}

	}

}
