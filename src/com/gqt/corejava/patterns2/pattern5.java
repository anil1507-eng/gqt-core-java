package com.gqt.corejava.patterns2;

import java.util.Scanner;

public class pattern5 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size:");
		int n =sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
          
            for (int j = i; j < n; j++) {
                System.out.print("	");
            }
            
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print(i+"	");
            }
            System.out.println(); 
		}
		
		sc.close();

	}

}
