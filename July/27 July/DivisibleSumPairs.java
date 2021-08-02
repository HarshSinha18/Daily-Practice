package July.July14;
import java.util.Scanner;
public class DivisibleSumPairs {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0 ; i < n ; i++) {
			arr[i] = sc.nextInt();
		}
		divisibleSumPairs(arr,n,k);
	}
	public static void divisibleSumPairs(int arr[] , int n , int k) {
		int count=0;
		for(int i = 0 ; i < n ; i++ ) {
			for(int j = 0 ; j < n ; j++) {
					if((arr[i]+arr[j])%k==0 && i<j) {
						count++;
				}
					
			}
		}
		System.out.println(count);
		
	}

}
