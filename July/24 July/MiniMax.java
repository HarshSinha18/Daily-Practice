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