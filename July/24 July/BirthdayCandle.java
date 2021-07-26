package July.July14;
import java.util.Scanner;
public class BirthdayCandle{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		birthdayCakeCandles(n);		
	}
	public static void birthdayCakeCandles(long n ) {
		try {
		Scanner sc = new Scanner(System.in);
        long candles[] = new long [(int) n];
        int count = 0;
		long max = 0;
		for(int i = 0 ; i < n; i++) {
			candles[i] = sc.nextInt();
			if(candles[i]>=max) {
				max=candles[i];
			}
			}
		for(int h = 0 ; h < n ; h++) {
		   if(candles[h]==max) {
			   count++;
		   }
		}
		System.out.println(count);
		}catch(Exception e) {
			
		}
	}
	}