package Flow_Control;
import java.util.Scanner;
public class GenderAge {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter gender(male/female");
		String gender=sc.nextLine().toLowerCase();
		
		System.out.println("Enter the age:");
		int age=sc.nextInt();	
		
		double rate;
		if(gender.equals("female")) {
			if(age>1 && age<=58) {
				rate=8.2;
				System.out.println("Interst Rate:"+rate+"%");
			}else if(age>=59 && age<=100) {
				rate=9.2;
				System.out.println("Interst Rate:"+rate+"%");
			}else {
				System.out.println("Invalid Age!");
			}
		}
		if(gender.equals("male")) {
			if(age>1 && age<=58) {
				rate=8.4;
				System.out.println("Interst Rate:"+rate+"%");
			}else if(age>=59 && age<=100) {
				rate=10.5;
				System.out.println("Interst Rate:"+rate+"%");
			}else {
				System.out.println("Invalid Age!");
			}
			sc.close();
		}
		}
			
	}
