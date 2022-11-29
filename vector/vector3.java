import java.util.Arrays;
import java.util.Scanner;

class vector3 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int[] nums = new int[6];
		int[] even = new int[6];
		int[] odd = new int[6];

		int nums_count = 0;
		int even_count = 0;
		int odd_count = 0;
		int i = 0;
		
		do {
			
			System.out.println("##################");
			System.out.println("Numbers ("+ nums_count +")");
			System.out.println(Arrays.toString(nums));
			System.out.println("##################");
			System.out.println("Even Numbers ("+ even_count +")");
			System.out.println(Arrays.toString(even));
			System.out.println("##################");
			System.out.println("Odd Numbers ("+ odd.length +")");
			System.out.println(Arrays.toString(odd));
			System.out.println("##################");

			if(i < nums.length) {
				System.out.print("\n"+"Enter Number ("+ nums_count +"): ");
				nums[i] = in.nextInt();
				nums_count++;

				if(nums[i] % 2 == 0) {
					even[i] = nums[i];
					even_count++;
				}else {
					odd[i] = nums[i];
					odd_count++;
				}
			}

			if(i != nums.length)
				for(int a = 0; a < 12; a++) {
					System.out.print("\033[1F\33[K");
				}

			i++;
		}while(i <= nums.length);
		
	}	
	
}
