package Flow_Control;

public class UserMainCode {

    public static int isEven(int input1) {
        if (input1 % 2 == 0) {
            return 2; 
        } else {
            return 1; 
        }
    }

    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 7;
        int num3 = 0;
        int num4 = -5;
        int num5 = -6;

        System.out.println("Number: " + num1 + " - Result: " + isEven(num1)); 
        System.out.println("Number: " + num2 + " - Result: " + isEven(num2)); 
        System.out.println("Number: " + num3 + " - Result: " + isEven(num3)); 
        System.out.println("Number: " + num4 + " - Result: " + isEven(num4)); 
        System.out.println("Number: " + num5 + " - Result: " + isEven(num5)); 
    }}
