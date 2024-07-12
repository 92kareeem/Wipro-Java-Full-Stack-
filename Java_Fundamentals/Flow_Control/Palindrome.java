package Flow_Control;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int number=sc.nextInt();
		int originalnum=number;
		int reversed=0,digit=0;
		while(number!=0) {
			digit=number%10;
			reversed=reversed*10+digit;
			number/=10;
		}
		if(originalnum==reversed) {
			System.out.println(originalnum+" is a palindrome");
		}else {
			System.out.println(originalnum+" is not a palindrome");
		}
}
}