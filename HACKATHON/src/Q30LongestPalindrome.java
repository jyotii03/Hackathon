import java.util.Scanner;

public class Q30LongestPalindrome {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String newString = "";
		int len = 0;
		System.out.println("Enter the string to check = ");
		String str1 = sc.nextLine();

		String[] sarray = str1.split(" ");
		len = sarray[0].length();
		for (String str : sarray) {
			int i = 0, j = str.length() - 1;
			boolean flag = true;
			while (i < j) {

				flag = true;
				if (str.charAt(i) != str.charAt(j)) {
					flag = false;
					break;
				}
				i++;
				j--;

			}

			if (flag == true) {

				if (str.length() > len)
					newString = str;

			}

		}

		System.out.println("Longest Palindrom is " + newString);
	}

}
