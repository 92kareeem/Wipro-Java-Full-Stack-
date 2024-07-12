package Flow_Control;
import java.util.Scanner;
public class Posneg {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer number: ");
        int num = input.nextInt();

        if(num > 0) {
            System.out.println("The number is Positive");
        } else if(num < 0) {
            System.out.println("The number is Negative");
        } else {
            System.out.println("The number is Zero");
        }
        input.close();
    }
}