/*
If the difference between the  grade  and the next multiple of 5 is less than 3 , round  up to the next multiple of  5.
If the value of   grade is less than  38 , no rounding occurs as the result will still be a failing grade.

*/


package July.July14;
import java.util.Scanner;
public class GradingStudents {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int grades[] = new int [n];
		for(int i = 0 ; i < n ; i++){
			grades[i] = sc.nextInt();	
	}
		gradingStudents(grades , n);

	}
	public static void gradingStudents(int grades[] , int n) {
		int sum = 0;
		int ans = 0;
		for(int j = 0 ; j < n ; j++) {
			for(int k = 0 ; k< 5 ; k++) {
				 sum = grades[j]+k;
			if(sum%5==0) {
				if (k<3 && grades[j]>=38) {
					ans = grades[j]+k;
					System.out.println(ans);
					break;
				}else {
					ans = grades[j]+0;
					System.out.println(ans);
					break;
				}
			}
		}		
		}	
}
}
