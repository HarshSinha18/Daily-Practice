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
