/*                                 Question
 You've to count the number of digits in a number.
 Take as input "n", the number for which the digits has to be counted. 
 Print the digits in that number. */

package July.July13;
import java.util.Scanner;
public class Count_Digit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		System.out.print("Enter a Number : ");
		int n = sc.nextInt();
		int a = n;
		while(n!=0) {
			n/=10;
			count++;
		}
	System.out.println(+count+" digits is present in " +a);
		
		

	}

}
