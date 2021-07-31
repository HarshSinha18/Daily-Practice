package July.July14;
import java.util.Scanner;
public class BreakingTheRecords {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int scores[] = new int[n];
		for(int j = 0; j < n ; j++) {
			scores[j] = sc.nextInt();
		}
		breakingRecords( n , scores) ;
		}
public static void breakingRecords(int n , int[] scores) {
	int minCount=0;
	int maxCount = 0;
	int max=scores[0];
	int min =scores[0];
	
	for(int i = 1 ; i < n ; i++) {
		if(scores[i]<min) {
			min=scores[i];
			minCount+=1;
		}else if(scores[i]>max) {
			max=scores[i];
			maxCount+=1;
		}
		
		
	}
	System.out.println(maxCount+" "+minCount);
}

	

}
