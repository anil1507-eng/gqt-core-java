/**
 * 
 */
package com.gqt.corejava.Arrays;
import java.util.Scanner;
/**
 * 
 */


class Arrayoperations{
	int arr[];
	Scanner sc = new Scanner(System.in);
	
	void CreateArray() {
		System.out.print("Enter the Array Size: ");
		int n = sc.nextInt();
		
		//Creating an array
		 arr = new int [n];
		 
		 System.out.println("Array Created");
		 System.out.println("------------------");
	}
	
	void collectData() {
		for( int i =0; i<arr.length; i++) {
			System.out.print("Enter the marks of the student "+(i+1)+" = ");
			
			arr[i]=sc.nextInt();
		}
		System.out.println("Data is Collected");
		System.out.println("------------------");
	}
	
	void displayData() {
		for(int i=0; i<arr.length; i++) {
			System.out.println("The marks of the student "+(i+1)+" is = "+arr[i]+"  --> "+(arr[i]>30 ? "Pass" : "False") );
		}
		System.out.println("-----------------------------------------------");
	}
	
}

public class ArrayCode2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Arrayoperations ao = new Arrayoperations();
		
		ao.CreateArray();
		ao.collectData();
		ao.displayData();
	
	}

}
