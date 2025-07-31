/**
 * 
 */
package com.gqt.corejava.Arrays;

import java.util.Scanner;

class Addition{

	Scanner sc = new Scanner(System.in);
	int a[][];
	int b[][];
	int result[][];
	int res[][];
	
	void createArray() {
		
			System.out.print("Enter the number of rows : ");
			int rows = sc.nextInt();
			
			System.out.print("Enter the number of columns : ");
			int columns = sc.nextInt();
			
			
			a = new int[rows][columns];
			b = new int[rows][columns];
			result = new int[rows][columns];
			res = new int[rows][columns];
			
			
			System.out.println("---------------------");
		}
	
	void collectData() {
		for(int i=0; i<a.length; i++) {

			for(int j =0; j<a[i].length; j++) {
				System.out.println("Enter the value in "+(i)+" row and "+(j)+" column : ");
				a[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Enter the values for second matrix:");
		for(int i=0; i<b.length; i++) {

			for(int j =0; j<b[i].length; j++) {
				System.out.println("Enter the value in "+(i)+" row and "+(j)+" column : ");
				b[i][j]=sc.nextInt();
			}
		}
	}
	
	void Add() {
		for(int i=0; i<result.length; i++) {

			for(int j =0; j<result[i].length; j++) {
				result[i][j]=a[i][j]+b[i][j];
			}
		}
	}
	
	
	
	void multiply() {
		for(int i=0; i<a.length; i++) {

			for(int j =0; j<a[i].length; j++) {
				for(int k =0;k<a.length; k++) {
					res[i][j]= res[i][j]+(a[i][k]*b[k][j]);
				}
			  }
		     }
	        }
	

	
	void display() {
		System.out.println("ADDITION OF MATRIX");
		for(int i=0; i<result.length; i++) {
			for(int j =0; j<result[i].length; j++) {
				System.out.print(result[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("MULTIPICATION OF MATRIX");
		for(int i=0; i<result.length; i++) {
			for(int j =0; j<result[i].length; j++) {
				System.out.print(res[i][j]+" ");
			}
			System.out.println();
		}
	  }
}


public class AdditionOfMatrix {


	public static void main(String[] args) {
		Addition a = new Addition();
		a.createArray();
		a.collectData();
		a.Add();
		a.multiply();
		a.display();

	}

}
