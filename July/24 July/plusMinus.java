package July.July14;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;
public class plusMinus {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0 ;  i< n ; i++) {
			arr[i] = sc.nextInt();
		}
	plusMinus(arr , n);
	}
	public static void plusMinus(int[] arr , int n) {
		int plus = 0;
		int minus = 0;
		int zero = 0;
		for(int j = 0 ; j < n ; j++) {
			if(arr[j]>0) {
				plus++;
			}
			else if(arr[j]<0) {
				minus++;
			}
			else {
				zero++;
			}
		}
	    double a = (float)plus/n;
		double b = (float)minus/n;
		double c = (float)zero/n;
		NumberFormat nm = new DecimalFormat("#0.000000");
		System.out.println(nm.format(a));
		System.out.println(nm.format(b));
		System.out.println(nm.format(c));
		
	}

}