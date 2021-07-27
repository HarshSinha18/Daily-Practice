package July.July14;
import java.util.Scanner;
public class NumberLineJumps {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x1 = sc.nextInt();
		int v1 = sc.nextInt();
		int x2 = sc.nextInt();
		int v2 = sc.nextInt();
		 String ans = kangaroo(x1,x2,v1,v2);
		 System.out.println(ans);
	}
	public static String kangaroo(int x1 , int v1 , int x2 , int v2) {
		if(v1<=v2) {
			return  "NO";
			}
		if((x2-x1)%(v1-v2)==0) {
			return "YES";
		}else {
		return "NO";
	
}
}
}