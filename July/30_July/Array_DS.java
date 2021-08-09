package July.July14;
import java.util.Scanner;
public class Array_DS {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int A[] = new int[n];
		for(int i = 0 ; i < n ; i++) {
			A[i] = sc.nextInt();
		}
		reverseArray(A , n);
	}
	public static void reverseArray(int A[] , int n) {
		for(int j = n-1 ; j >=0 ; j--) {
			System.out.print(A[j]+" ");
		}
	}

}
