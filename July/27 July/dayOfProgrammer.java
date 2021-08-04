package July.July14;
import java.util.Scanner;
public class dayOfProgrammer {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		dayOfProgrammer(year);
	}
	public static void dayOfProgrammer(int year) {
		int date = 0;
		if(year==1918) {
			date = 26;
		}
			if(year > 1917&&year!=1918) {
	            if(year % 400 == 0 || (year%4 == 0 && year%100 != 0)) {
	            	date=12;
	            }else {
	            	date=13;
	            }
			
	            }else if(year >= 1700 && year <= 1917) {
	                if(year % 4 == 0) {
	                	date=12;
	                }
			
		}
	
		System.out.println(date+".09."+year);
	
	}
}
