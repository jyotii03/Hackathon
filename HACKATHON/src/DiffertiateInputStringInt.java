import java.util.Scanner;

public class DiffertiateInputStringInt {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		checkMethod();
		checkMethod();
		checkMethod();
		sc.close();
	}

	private static void checkMethod() {

		System.out.println("Enter your string to check ");
		boolean flag = true;
		Scanner sc1 = new Scanner(System.in);
		String s = sc1.next();
		for (int i = 0; i < s.length(); i++) {
			flag = true;
			if (Character.isDigit(s.charAt(i)) == false)
				flag = false;
			break;

		}

		if (flag == true) {
			System.out.println("It is Digit!");
		} else if (s.equalsIgnoreCase("true") || s.equalsIgnoreCase("false")) {
			System.out.println("It is boolean!");
		} else {
			System.out.println("It is String!");
		}

	}

}
