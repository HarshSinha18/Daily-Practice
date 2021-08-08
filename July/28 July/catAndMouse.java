package July.July14;
import java.util.Scanner;
public class catAndMouse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();
		int x = 0 , y = 0 , z = 0;
		for(int i = 0 ; i < q; i++) {
			 x = sc.nextInt();
			 y = sc.nextInt();
			 z = sc.nextInt();	
		
		catAndMouse(x , y , z , q);
	}
	}
	public static void catAndMouse(int x , int y , int z , int q) {
		if(Math.abs(x-z)<Math.abs(y-z)) {
			System.out.println("Cat A");
		}else if(Math.abs(y-z)<Math.abs(x-z)) {
			System.out.println("Cat B");
		}else{
			System.out.println("Mouse C");
		}
		}
		}



