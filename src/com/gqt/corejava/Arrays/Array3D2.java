package com.gqt.corejava.Arrays;

import java.util.Scanner;

class ArrayOperation3D1{
	String arr[][][];
	Scanner sc = new Scanner(System.in);
	
	void createArray() {
		System.out.print("Enter the sch count : ");
		int sch = sc.nextInt();
	
		
		arr = new String[sch][][];
		
		for(int i=0; i<arr.length; i++) {
			System.out.println("Enter the class count inside the school :"+(i+1));
			arr[i] = new String[sc.nextInt()][];
		}
		
			for(int i=0; i<arr.length; i++) {
				System.out.println("inside the school no:"+(i+1));
				for(int j=0; j<arr[i].length;j++) {
					System.out.println("enter the student count inside the class no: "+(j+1));
					arr[i][j] = new String[sc.nextInt()];
				}
				
			}
			
		System.out.println("Array Created");
		System.out.println("----------------");
	
	}
	void collectData() {
		for(int i=0; i<arr.length; i++) {
			System.out.println("inside the school :"+(i+1));
			for(int j =0; j<arr[i].length; j++) {
				System.out.println("inside the class "+(j+1));
			for(int k=0; k<arr[i][j].length;k++) {
				System.out.println("Enter the "+(k+1)+" student name in class "+(j+1)+": ");
				arr[i][j][k]=sc.next();
			}
		}
	}
	}
	void display() {
		for(int i=0; i<arr.length; i++) {
			System.out.println("inside the class :"+(i+1));
			for(int j =0; j<arr[i].length; j++) {
				System.out.println("inside the class :"+(j+1));
				for(int k=0; k<arr[i][j].length;k++) {
				System.out.println("the student name in "+(k+1)+" class "+arr[i][j][k]);
				}
			}
		}
	}
}

public class Array3D2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayOperation3D1 ao = new ArrayOperation3D1();
		ao.createArray();
		ao.collectData();
		ao.display();

	}

}