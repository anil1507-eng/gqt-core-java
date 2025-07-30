package com.gqt.corejava.Arrays;

import java.util.Scanner;

class ArrayOperation3D{
	String arr[][][];
	Scanner sc = new Scanner(System.in);
	
	void createArray() {
		System.out.print("Enter the School count : ");
		int sch = sc.nextInt();
		System.out.print("Enter the class count : ");
		int cls = sc.nextInt();
		System.out.print("Enter the Student count : ");
		int stu = sc.nextInt();
	
		
		arr = new String[sch][cls][stu];
		
		
		System.out.println("Array Created");
		System.out.println("----------------"); 
	}
	
	
	void collectData() {
		for(int i=0; i<arr.length; i++) {
			System.out.println("inside the school :"+(i+1));
			for(int j =0; j<arr[i].length; j++) {
				System.out.println("inside the class:"+(j+1));
				for(int k =0; k<arr[i][j].length; k++) {
					System.out.println("Enter the "+(k+1)+" student name in class "+(j+1)+": ");
					arr[i][j][k]=sc.next();
				}
			}
		}
		System.out.println("_____________________________________________________________");
	}
	
	void display() {
		for(int i=0; i<arr.length; i++) {
			System.out.println("inside the school :"+(i+1));
			for(int j =0; j<arr[i].length; j++) {
				System.out.println("inside the Class :"+(j+1));
				for(int k =0; k<arr[i][j].length; k++) {
					System.out.println("the student name in  class "+arr[i][j][k]);
				}
				
			}
			System.out.println("_____________________________________________________________-");
		}
	}
}
public class Array3D1 {
public static void main(String arg[]) {
	ArrayOperation3D ao = new ArrayOperation3D();
	ao.createArray();
	ao.collectData();
	ao.display();
}
}
