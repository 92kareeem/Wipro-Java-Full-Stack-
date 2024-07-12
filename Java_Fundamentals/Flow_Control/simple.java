package Flow_Control;

public class simple {
	public static void main(String args[]) {
	char var=',';
		if(Character.isLetter(var)) {
			System.out.println("Alphabet");
		}
		else if(Character.isDigit(var)){
			System.out.println("Digit");
		}else {
			System.out.println("Special Character");
		}
}
}

