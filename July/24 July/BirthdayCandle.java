/* You are in charge of the cake for a child's birthday. You have decided the cake will have one candle for each year of their total age.
They will only be able to blow out the tallest of the candles. Count how many candles are tallest.
candles[ 4 , 4 , 1 , 3]

The maximum height candles are 4 units high. There are 2 of them, so return 2 .
*/

package July.July14;
import java.util.Scanner;
public class BirthdayCandle{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		int max = 0;
		 long candles[] = new long [(int) n];
		 for(int i = 0 ; i < n; i++) {
				candles[i] = sc.nextInt();
				if(candles[i]>=max) {
					max=(int) candles[i];
				}
				}
		birthdayCakeCandles(n , max , candles);		
	}
	public static void birthdayCakeCandles(long n , long max , long candles[]) {
		Scanner sc = new Scanner(System.in);
        int count = 0;
		for(int h = 0 ; h < n ; h++) {
		   if(candles[h]==max) {
			   count++;
		   }
		}
		System.out.println(count);
	}
	}
