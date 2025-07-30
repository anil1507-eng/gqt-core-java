package com.gqt.corejava.Arrays;

import java.util.Scanner;

class ArrayOperations1{
	String arr[][];
	Scanner sc = new Scanner(System.in);
	
	void createArray() {
		System.out.print("Enter the class count : ");
		int cls = sc.nextInt();
	
		
		arr = new String[cls][];
		
		for(int i=0; i<arr.length; i++) {
			System.out.println("Enter the count of students inside the class no: "+(i+1));
			arr[i] = new String[sc.nextInt()];
		}
		
		System.out.println("Array Created");
		System.out.println("----------------");
	}
	void collectData() {
		for(int i=0; i<arr.length; i++) {
			System.out.println("inside the class :"+(i+1));
			for(int j =0; j<arr[i].length; j++) {
				System.out.println("Enter the "+(j+1)+" student name in class "+(i+1)+": ");
				arr[i][j]=sc.next();
			}
		}
	}
	
	void display() {
		for(int i=0; i<arr.length; i++) {
			System.out.println("inside the class :"+i);
			for(int j =0; j<arr[i].length; j++) {
				System.out.println("the student name in "+(j+1)+" class "+arr[i][j]);
				
			}
		}
	}
}

public class Array2D2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayOperations1 ao = new ArrayOperations1();
		ao.createArray();
		ao.collectData();
		ao.display();

	}

}