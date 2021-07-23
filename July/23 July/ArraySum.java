/* Given an array of integers, find the sum of its elements.
          ar=[1 ,2 ,3] 
	      1+2+3 = 6 <-- Output
*/


package July.July14;
import java.util.Scanner;
public class ArraySum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ar[] = new int[n];
		for(int i = 0 ; i <n ; i++) {
			ar[i] = sc.nextInt();		
		}
		int ans = simpleArraySum(ar);
		System.out.println(ans);
	}
	public static int simpleArraySum(int ar[]) {
		int sum = 0;
		for(int j = 0 ; j < ar.length ; j++) {
			sum+=ar[j];	
		}
		return sum;
	}
	
}
