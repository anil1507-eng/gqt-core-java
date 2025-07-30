package com.gqt.corejava.Arrays;

import java.util.Scanner;

public class ArrayCode1 {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the S Size: ");
		int n = sc.nextInt();
		
		//Creating an array
		int arr[] = new int [n];
		
		//Storing the data
		for( int i =0; i<arr.length; i++) {
			System.out.print("enter the marks of the student "+(i+1)+" :");
			
			arr[i]=sc.nextInt();
		}
		System.out.println("------------------");
		
		//Displaying the data 
		for(int i=0; i<arr.length; i++) {
			System.out.println("The marks of the student "+(i+1)+" is = "+arr[i]);
		}
		sc.close();
	}
}
