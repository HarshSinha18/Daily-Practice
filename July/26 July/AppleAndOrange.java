package July.July14;
import java.util.Scanner;
public class AppleAndOrange {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int t = sc.nextInt();
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		int apple[] = new int [m];
		int orange[] = new int [n];
		for(int i = 0 ; i < m ; i++) {
			apple[i] = sc.nextInt();
		}
		for(int j = 0 ;  j< n ; j++) {
		  orange[j] = sc.nextInt();
		}
		countAppleAndOrange(apple , orange , m , n , a , b , s , t);
		
	}
	public static void countAppleAndOrange(int apple[] , int orange[] , int m , int n , int a , int b , int s , int t) {
		int appleSum = 0;
		int orangeSum = 0;
		int appleCount = 0;
		int orangeCount  =0 ;
		for(int k = 0 ; k < m ; k++) {
			appleSum = a + apple[k];
			if(appleSum>=s && appleSum<=t) {
				appleCount++;	
			}
			
			}
		System.out.println(appleCount);
		for(int l = 0 ; l < n ; l++) {
			 orangeSum  = b + orange[l];
			 if(orangeSum>=s && orangeSum<=t) {
					orangeCount++;	
				}

		}
		System.out.println(orangeCount);

	}
	}