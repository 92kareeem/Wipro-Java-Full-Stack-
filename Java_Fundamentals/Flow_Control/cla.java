package Flow_Control;

public class cla {
        public static void main(String[] args) {
            if(args.length == 0) {
                System.out.println("No values");
            } else {
                for(int i=0; i<args.length-1; i++) {
                    System.out.print(args[i] + ",");
                }
                System.out.println(args[args.length-1]);
            }
        }
    }