package array;
import java.util.Arrays;
public class ArrSort {
	public static void main(String[] args) {
	 int[] number= {6,7,8,44,5,78,20,10};
	 Arrays.sort(number);
	 System.out.println("Sorted Array:");
	 for (int i = 0; i < number.length; i++) {
	     System.out.print(number[i] + " ");
	 }
}
}
