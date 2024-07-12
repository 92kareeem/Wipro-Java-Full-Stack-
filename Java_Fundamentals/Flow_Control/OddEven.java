package Flow_Control;
import java.util.Scanner;
public class OddEven {
    public static void main(String args[]){
        Scanner input1=new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int num = input1.nextInt();

        if(num%2== 0) {
            System.out.println("The number is Even");
        } else{
            System.out.println("The number is Odd");
        }
        input1.close();
    }}
