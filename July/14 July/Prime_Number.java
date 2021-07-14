/*                                        Question 
ou've to check whether a given number is prime or not.
 Take a number "t" as input representing count of input numbers to be tested.
 Take a number "n" as input "t" number of times.
 For each input value of n, print "prime" if the number is prime and "not prime" otherwise.
 */


package July.July14;
import java.util.Scanner;
public class Prime_Number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int count = 0;
		int t = sc.nextInt();
		for(int i = 0 ; i < t ; i++) {
			int n = sc.nextInt();
			int count = 0;
			for(int j = 1 ; j<=n ; j++) {
				if(n%j==0) {
					count++;
				}			
			}
			if(count==2) {
				System.out.println( "Prime Number");
			}
			else {
				System.out.println(" not Prime Number");
			}		
			
		}
		

	}

}


//import java.util.*;
//
//public class Prime_Number {
//
//  public static void main(String[] args) {
//    Scanner scn = new Scanner(System.in);
//
//    int t = scn.nextInt();
//    for (int i = 0; i < t; i++) {
//      int n = scn.nextInt();
//      int count = 0;
//      for (int div = 1; div <= n; div++) {
//        if (n % div == 0) {
//          count++;
//        }
//      }
//      if (count == 2) {
//        System.out.println("prime");
//      } else {
//        System.out.println("notprime");
//      }
//    }
//
//  }
//}
