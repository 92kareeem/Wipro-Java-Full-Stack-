package Flow_Control;

public class LastDig {
        public static boolean lastDigit(int a, int b) {
            int lastDigitA = a % 10;
            int lastDigitB = b % 10;
    
            return lastDigitA == lastDigitB;
        }
        public static void main(String[] args) {
            System.out.println(lastDigit(7, 17)); // true
            System.out.println(lastDigit(6, 17)); // false
            System.out.println(lastDigit(3, 113)); // true
    
            System.out.println(lastDigit(123, 23)); // true
            System.out.println(lastDigit(100, 0)); // true
            System.out.println(lastDigit(123, 456)); // false
        }
    }
