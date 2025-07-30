/**
 * 
 */
package com.gqt.corejava.Arrays;

import java.util.Scanner;

class EclipseProduction{
	Scanner sc = new Scanner(System.in);
	int prod[][][];
	int invest = 100;
	int profit;
	int previous = 80;
	int sum;
	
	void createArray() {
		System.out.print("Enter the number of categories : ");
		int categories = sc.nextInt();
		
		System.out.print("Enter the number of movies in each category : ");
		int movie = sc.nextInt();
		
		System.out.print("Enter the number of languages in each movie : ");
		int languages = sc.nextInt();
		
		prod = new int[categories][movie][languages];
		
		
		
		System.out.println("---------------------");
	}
	
	void collectData() {
		
		for(int i =0; i<prod.length; i++) {
			System.out.println("Inside the movie "+(i+1));
			for(int j=0; j<prod[i].length; j++) {
				System.out.println("Inside the category "+(j+1));
				for(int k =0; k<prod[i][j].length; k++) {
					System.out.println("Enter the Revenue of "+(k+1)+" language in "+(j+1)+" category of "+(i+1)+" movie: ");
					prod[i][j][k]=sc.nextInt();
					sum=sum+prod[i][j][k];
				}
			}
			System.out.println();
		}
		
		System.out.println("-----------------------------------------------------");
	}
	
	void display() {
		
		for(int i =0; i<prod.length; i++) {
			System.out.println("inside the movie "+(i+1));
			for(int j=0; j<prod[i].length; j++) {
				System.out.println("Inside the category "+(j+1));
				for(int k =0; k<prod[i][j].length; k++) {
					System.out.println("The revenue of "+(j+1)+" category movie in "+(i+1)+" is :"+prod[i][j][k]);
				}
			}
			System.out.println();
		}
		
		System.out.println();
			
		System.out.println("Total revenue generated from movies : "+sum);
		
		profit = sum - invest;
		System.out.println();
		if(sum>invest) {
			System.out.println("Hemanth is Profitable with "+(profit)+" Crores.");
		}
		else {
			System.out.println("Hemanth is Not Profitable with "+(profit)+" Crores.");
		}
		System.out.println("--------------------------------");
		if(profit > previous) {
			System.out.println("Profitable compare to previous year.");
		}else {
			System.out.println("Not Profitable compare with previous year.");
		}
	
	}
	}
/**
 * 
 */
public class productionHouse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		EclipseProduction ep = new EclipseProduction();
		ep.createArray();
		ep.collectData();
		ep.display();
	}

}
