package array;

public class MinMaxArr {
	public static void main(String[] args) {
		int[] array= {1,2,3,4,5};
		
		int max=array[0];
		int min=array[0];
		
		for (int i = 1; i < array.length; i++) {
		    if (array[i] > max) {
		        max = array[i];
		    }
		    if (array[i] < min) {
		        min = array[i];
		    }
		}
		System.out.println("Maximum element:"+max);
		System.out.println("Minimum Elements:"+min);
	}
}
