import java.util.Arrays;
import java.util.Scanner;

public class Q5UniqueAndDuplicates {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter you 5 numbers of array ");
		String old = "";
		int arr[] = new int[5];
		for (int i = 0; i < 5; i++) {
			arr[i] = sc.nextInt();
			old = old + String.valueOf(arr[i]);
			sc.close();
		}

		char[] cArray = old.toCharArray();

		Arrays.sort(cArray);

		int count = 0;

		String s = "";

		boolean flag = false;
		for (int i = 0; i < cArray.length; i++) {
			flag = false;

			for (int j = i + 1; j < cArray.length; j++) {

				if (cArray[i] == cArray[j]) {
					flag = true;
					break;
				}

			}

			if (!flag) {
				s = s + cArray[i];
			}
		}
		String unique = "";
		String duplicate = "";
		s = s.trim();
		char[] newArray = s.toCharArray();
		for (char c : newArray) {
			for (int i = 0; i < cArray.length; i++) {
				if (cArray[i] == c) {
					count++;
				}
			}
			System.out.println(c + " appeared  " + count + "   times");
			if (count == 1) {
				unique = unique + " " + c;
			} else {
				duplicate = duplicate + " " + c;
			}
			count = 0;

		}
		System.out.println("Unique numbers in array are " + unique);

		System.out.println("Duplicate numbers in array are " + duplicate);
	}
}
