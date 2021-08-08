package July.July14;
import java.util.*;
public class SalesByMatch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ar[] = new int[n];
		for(int i = 0 ; i < n ; i++) {
			ar[i] = sc.nextInt();
		}
		sockMerchant(ar , n);

	}
	public static void sockMerchant(int ar[] , int n) {
		Arrays.sort(ar);
		int num=ar[0];
		int count = 0;
		int sum = 0;
		System.out.println(Arrays.toString(ar));
	for(int i = 0 ; i < n ; i++) {
	if(num==ar[i]) {
		count++;
		i++;
	}
	else {
		num=ar[i]; 
	}
	}
	sum+=count;
	System.out.println(sum);
	}
}

