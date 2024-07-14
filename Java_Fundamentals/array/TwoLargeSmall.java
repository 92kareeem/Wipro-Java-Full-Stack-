package array;
import java.util.Arrays;
public class TwoLargeSmall {
	public static void main(String[] args) {
		int [] numbers= {4,7,9,1,0,55,61,40};
		
		Arrays.sort(numbers);
		
		int smallest1=numbers[0];
		int smallest2=numbers[1];
		
		int largest1=numbers[numbers.length-1];
		int largest2=numbers[numbers.length-1];
		
		System.out.println("The largest 2 numbers are " + largest1 + " and " + largest2);
        System.out.println("The smallest 2 numbers are " + smallest1 + " and " + smallest2);
	}
}
