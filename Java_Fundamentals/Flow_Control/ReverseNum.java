package Flow_Control;
import java.util.Scanner;
public class ReverseNum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number to be reversed:");
		int number=sc.nextInt();
		
		int reversed=0,digit=0;
		while(number!=0) {
			digit=number%10;
			reversed=reversed*10+digit;
			number/=10;
		}
		System.out.println("Reversed Number: "+reversed);
		
	}
}
