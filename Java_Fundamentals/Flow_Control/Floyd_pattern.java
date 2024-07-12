package Flow_Control;

public class Floyd_pattern {
	public static void main(String[] args) {
	int rows=5;
	for (int i = 1; i <= rows; i++) {
        for (int j = 1; j <= i; j++) {
				System.out.print(" * ");
			}
		System.out.println();
		}
	}
}
