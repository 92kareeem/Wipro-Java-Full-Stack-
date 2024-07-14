package array;

public class ArrNumCheck {
	public static void main(String[] args) {
		int[] array= {1,4,9,16,25};
		
		int search_num=5;
		int index=-1;
		for(int i=0;i<=array.length;i++) {
			if(array[i]==search_num) {
				index=i;
				break;
			}
		}
		if(index==-1) {
			System.out.println("-1");
		}
		else {
			System.out.println(index);
		}
	}
}