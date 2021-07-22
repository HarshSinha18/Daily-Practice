package July.July14;

/*public class SumOfTwoNumber {

	public static void main(String[] args) {
		
		int array[] = { 3,2,4 };
		int target = 6;
		int sum = 0;
		for(int  i = 0 ; i < array.length ; i++) {
		for(int  j = 0 ; j<array.length ; j++) {
			 sum = array[i]+array[j];
			 if(sum==target && j>i) {
				 System.out.println("["+i+","+j+"]");		 
		}
		}
	}
}
} 
*/
public class SumOfTwoNumber{
	public static void main(String[] args) {
		int nums[] = {2,7,11,15};
		int target = 9;
		twoSum( nums , target);
	}
	
	public  static void twoSum(int nums[] , int target) {
		int sum =0;
		for(int i = 0 ; i <nums.length ; i++) {
			for(int j = 0 ; j<nums.length ; j++) {
				sum=nums[i]+nums[j];
				if(sum==target && j>i) {
					 System.out.println("["+i+","+j+"]");	
					
				}
			}
			
		}
	
	}

	}
