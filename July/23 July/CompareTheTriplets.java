package July.July14;
import java.util.Scanner;
public class CompareTheTriplets {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a[] = new int [3];
	int b[] = new int [3];
	for(int i = 0 ; i<3 ; i++) {
		a[i] = sc.nextInt();	
	}
	for(int j = 0 ; j< 3 ; j++) {
		b[j] = sc.nextInt();
	}
	compareTriplets(a , b);

	}
	public static void compareTriplets(int a[] , int b[]) {
		int aScore = 0;
	    int bScore = 0;
		for(int k = 0 ; k < 3 ; k++) {
			if(a[k]>b[k]) {
				aScore++;
			}else if(a[k]<b[k]) {
				bScore++;
			} else if(a[k]==b[k]) {
				aScore+=0;
				bScore+=0;
			}
		}
		System.out.println("["+aScore+","+bScore+"]");
		}		
	
	}


