package July.July14;
import java.util.Scanner;
public class BillDivision {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int bill[] = new int[n];
		for(int i = 0 ; i < n ; i++) {
			bill[i] = sc.nextInt();
		}
		int b = sc.nextInt();
			 bonAppetit(n , k , bill , b);
		}
		public static void  bonAppetit(int n , int k , int bill[] , int b){
			int sum =0;
			int div =0;
			int remain = 0;
			for(int i = 0 ; i < n ; i++) {
				if(i==k) {
					continue;
				}
				sum+=bill[i];
			}
			div=sum/2;
             remain = b-div;
             if(div==b) {
            	 System.out.println("Bon Appetit");
             }else {
            	 System.out.println(remain);
             }
	}
		
}
