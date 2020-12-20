import java.util.Scanner;

public class Q16COuntIntUpperLower {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your string ");
		String str = sc.nextLine();

		char[] cArray = str.toCharArray();
		int digit = 0, uCase = 0, lCase = 0;

		for (char c : cArray) {
			if ((int) c >= 48 && (int) c <= 57)
				digit++;
			else if ((int) c >= 97 && (int) c <= 122)
				lCase++;
			else if ((int) c >= 65 && (int) c <= 90)
				uCase++;
		}

		System.out.println("Digits in the String " + digit);
		System.out.println("Upper case char in the String " + uCase);
		System.out.println("Lower case in the String " + lCase);
		sc.close();
	}

}
