import java.util.Scanner;

public class Q4IntergerPalindrom {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number to check palindrome ");
		int count = sc.nextInt();

		int[] array = new int[count];
		for (int i = 0; i < count; i++) {
			System.out.println("Enter number " + (i + 1) + " = ");
		array[i] = sc.nextInt();
		}
		palindrome(array);
		sc.close();
	}

	static void palindrome(int[] arr) {

		int flag = 0;
		int n = arr.length;
		for (int i = 0; i <= n / 2 && n != 0; i++) {

			if (arr[i] != arr[n - i - 1]) {
				flag = 1;
				break;
			}
		}

		if (flag == 1)
			System.out.println("Not Palindrome");
		else
			System.out.println("Palindrome");
	}

}
