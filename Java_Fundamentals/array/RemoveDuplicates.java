package array;
import java.util.*;
public class RemoveDuplicates {
	public static void main(String[] args) {
		        Integer[] inputArray = {12, 34, 12, 45, 67, 89};
		        
		        List<Integer> uniqueElements = rmvDuplicates(inputArray);
		        
		        System.out.println(uniqueElements);
		    }
		    
		    public static List<Integer> rmvDuplicates(Integer[] arr) {
		        List<Integer> uniqueElements = new ArrayList<>();
		        
		        for (Integer element : arr) {
		            if (!uniqueElements.contains(element)) {
		                uniqueElements.add(element);
		            }
		        }
		        return uniqueElements;
		    }
		}