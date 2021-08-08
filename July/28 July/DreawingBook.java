package July.July14;
import java.util.Scanner;
public class DreawingBook {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int p = sc.nextInt();
		pageCount(n,p);			
	}
	public static void pageCount(int n , int p ) {
		int min1 = 0;
		int min2=0;
		int div = 0;
				div=p/2;
				min1 = div;
				if(n-p==1) {
					min2=1;
				}else{ 
					min2=((n-p))/2;
				}
     			if(min1<min2) {
				System.out.println(min1);
			}else {
				System.out.println(min2);
			}
	}
}