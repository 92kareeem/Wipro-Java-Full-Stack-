package array;

public class ArrSumSkipNum {
	public static void main(String[] args) {
	int[] array= {1,4,5,8,9,6,2,1,7};
		int sum=0;
		boolean flag=true;
		for(int num:array ) {
			if(num==6) {
				flag=false;
			}else if(num==7) {
				flag= true;
			}
			else if(flag){
				sum=sum+num;
			}
		}
	    System.out.println("Sum of the array: " + sum);
}}
