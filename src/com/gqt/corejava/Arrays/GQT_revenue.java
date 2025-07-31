package com.gqt.corejava.Arrays;

import java.util.Scanner;

class GQT_trust{
	String arr[][][];
	Scanner sc = new Scanner(System.in);
	long revenue;
	long medicalfee;
	long engineeringfee;
	long degreefee;
	
	void createArray() {
		System.out.print("Enter the college count : ");
		int sch = sc.nextInt();
		
		arr = new String[sch][][];
		
		for(int i=0; i<arr.length; i++) {
			System.out.print("Enter the classroom count inside the College "+(i+1)+" :");
			arr[i] = new String[sc.nextInt()][];
		}
		
			for(int i=0; i<arr.length; i++) {
				System.out.println("Inside the College no:"+(i+1));
				for(int j=0; j<arr[i].length;j++) {
					System.out.print("Enter the student count inside the classroom no "+(j+1)+" : ");
					arr[i][j] = new String[sc.nextInt()];
				}
				
			}
			
		System.out.println("Array Created");
		System.out.println("----------------");
	
	}
	void collectData() {
		for(int i=0; i<arr.length; i++) {
			System.out.println("Inside the College "+(i+1)+" :");
			for(int j =0; j<arr[i].length; j++) {
				System.out.println("Inside the Classroom "+(j+1)+" :");
			for(int k=0; k<arr[i][j].length;k++) {
				System.out.print("Enter the "+(k+1)+" student name in classroom no "+(j+1)+": ");
				arr[i][j][k]=sc.next();
				if(i==0) {
					revenue=revenue+2500000;
				}
				else if(i==1) {
					revenue=revenue+350000;
				}
				else {
					revenue=revenue+80000;
				}
			}
		}
	}
		
	}
	void display() {
		for(int i=0; i<arr.length; i++) {
			System.out.println();
			System.out.println("Inside the College "+(i+1)+" :");
			for(int j =0; j<arr[i].length; j++) {
				System.out.println("Inside the classroom "+(j+1)+" :");
				for(int k=0; k<arr[i][j].length;k++) {
				System.out.println("The student name in "+(k+1)+" class : "+arr[i][j][k]);
				}
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Total revenue generated : "+revenue);
	}
	 
	
}

public class GQT_revenue {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GQT_trust ao = new GQT_trust();
		ao.createArray();
		ao.collectData();
		ao.display();

	}

}