package July.July14;
import java.util.Scanner;
public class DiagonalSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int rSum = 0;
		int lSum = 0;
		int mainSum = 0 ;
		int ans = 0;
		int arr[][] = new int[n][n];
		for(int i = 0 ; i< n ; i++) {
			for(int j = 0 ; j < n ; j++) {
				arr[i][j] = sc.nextInt();	
			}
		}
		diagonalDifference(n , arr , rSum , lSum ,  ans);
	}
	public static void diagonalDifference(int n , int arr[][] , int rSum , int lSum , int ans) {
	
		for(int k = 0  ;  k < n ; k++) {
				rSum+=arr[k][k];			
		}
	          int m = n-1;
	    	for(int l = 0 ; l< n ; l++) {
	    		lSum+=arr[l][m];
	    		m--;
	    	}
		 ans = Math.abs(lSum-rSum);
		System.out.println(ans);
		
}
  }
