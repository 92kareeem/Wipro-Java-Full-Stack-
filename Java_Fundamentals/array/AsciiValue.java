package array;

public class AsciiValue {
	public static void main(String[] args) {
	int[] asciiArray = {68, 66, 67, 97, 98, 99};
	for (int asciiValue : asciiArray) {
	    char character = (char) asciiValue;
	    System.out.print(character + " ");
	}
}
}
