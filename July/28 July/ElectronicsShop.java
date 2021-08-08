package July.July14;
import java.util.Arrays;
import java.util.Scanner;
public class ElectronicsShop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int b = sc.nextInt();
		int n = sc.nextInt();
		int m = sc.nextInt();
		int keyboards[] = new int[n];
		int drives[] = new int[m];
		for(int i = 0 ; i < n ; i++) {
			keyboards[i] = sc.nextInt();
		}
		for(int j = 0 ; j < n ; j++) {
			drives[j] = sc.nextInt();
		}
		getMoneySpent(n , m , b , keyboards , drives);

	}
	public static void getMoneySpent(int n , int m , int b , int keyboards[] , int drives[]) {
		int max = 0;
		Arrays.sort(keyboards);
		Arrays.sort(drives);
		for(int i = 0 ; i < n ; i++) {
			for(int j = 0 ; j< m ; j++) {
				if(keyboards[i]+drives[j]<=b) {
					if(keyboards[i]+drives[j]>max) {
						max=keyboards[i]+drives[j];
					}
				}else {
					if(max==0)
					max=-1;
				}
			}
		}
		System.out.println(max);
		
	}
}
