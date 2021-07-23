/* Complete the aVeryBigSum function in the editor below. It must return the sum of all array elements.
            5
1000000001 1000000002 1000000003 1000000004 1000000005
Output--> 5000000015

*/


package July.July14;
import java.util.Scanner;
public class BigSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long ar[] = new long[n];
		for(int i = 0 ; i < n ; i++) {
			ar[i] = sc.nextInt();
		}
			aVeryBigSum(ar , n);
	}
	public static void aVeryBigSum(long ar[]  , int n) {
		long sum = 0;
		for(int j = 0 ; j< n ; j++) {
			sum+=ar[j];
		}
		System.out.println(+sum);
		

		
	}

}
