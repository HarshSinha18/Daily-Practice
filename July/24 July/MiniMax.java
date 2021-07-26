/* Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers.
Then print the respective minimum and maximum values as a single line of two space-separated long integers.
arr[ 1 , 2 , 3  , 4 , 5 ]
min : 1+3+5+7 = 16
max : 3 + 5 + 7 + 8 = 24

Output --> 16  24

*/


package July.July14;
import java.util.Scanner;
public class MiniMax {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long arr[] = new long[5];
		for(int i = 0 ; i<arr.length ; i ++) {
			 arr[i] = sc.nextLong();
		}
		miniMaxSum(arr);
	}
	public static void miniMaxSum(long arr[]) {
		long max = 0;
		long min = 1000000000000L;
		int  j = 0;
		long sum = 0;
				while(j<arr.length) {
		for(int i = 0 ;  i< arr.length ; i++) {
			if(i==j) {
				continue;
			}
			sum+=arr[i];
		}
		//System.out.println(sum);
		if(sum>max) {
			max = sum;
		}
		if(sum<min) {
			min=(long)sum;
		}
		j++;
		sum=0;
				}
				System.out.println(min+" "+max);

}
}
