/*
      #
     ##
    ###
   ####

*/

import java.util.Scanner;
public class StairCase {
	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 int n = sc.nextInt();
	 staircase(n);
	}
	public static void staircase(int n) {
		int space = n-1;
		for(int i = 1 ; i <= n ; i++) {
			// Space Loop
			for(int j = 1 ; j <= space ; j++) {
				System.out.print(" ");
		}
			space--;
			// Value Loop
			for(int j = 1 ; j<= i ; j++) {
				System.out.print("*");
			}
			System.out.println();
				
	}
	}
}
