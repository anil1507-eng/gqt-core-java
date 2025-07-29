/**
 * 
 */
package com.gqt.corejava.Arrays;

import java.util.Scanner;

/**
 * 
 */
class ArrayOperations{
	String arr[][];
	Scanner sc = new Scanner(System.in);
	
	void createArray() {
		System.out.print("Enter the class count : ");
		int cls = sc.nextInt();
		System.out.print("Enter the student count : ");
		int stu = sc.nextInt();
		
		arr = new String[cls][stu];
		
		System.out.println("Array Created");
		System.out.println("----------------");
	}
	void collectData() {
		for(int i=0; i<arr.length; i++) {
			System.out.println("inside the class :"+(i+1));
			for(int j =0; j<arr[i].length; j++) {
				System.out.println("Enter the student name in "+(i+1)+" class : ");
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

public class Array2D {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayOperations ao = new ArrayOperations();
		ao.createArray();
		ao.collectData();
		ao.display();

	}

}
