package array;
import java.util.Arrays;
public class RmvTens {
	public static void main(String[] args) {
		int[] result = array(new int[]{1, 10, 2, 10});

        System.out.println(Arrays.toString(result)); 
    }

    public static int[] array(int[] nums) {
        int[] result = new int[nums.length];
        int index = 0;

        for (int num : nums) {
            if (num != 10) {
                result[index] = num;
                index++;
            }
        }

        while (index < nums.length) {
            result[index] = 0;
            index++;
        }

        return result;
    }
}