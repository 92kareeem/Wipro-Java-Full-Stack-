public class String1 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Please provide exactly two arguments.");
            return;
        }
        String company = args[0];
        String city = args[1];
        String result = company + " Technologies " + city;
        System.out.println(result);
    }
}