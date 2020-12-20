import java.util.Arrays;
import java.util.Scanner;

public class Q6SelectionSortAscendingOrder {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers in Array ");
		int count = sc.nextInt();

		int[] array = new int[count];
		for (int i = 0; i < count; i++) {
			System.out.println("Enter number " + (i + 1) + " = ");
			array[i] = sc.nextInt();
		}
		System.out.println("Elements of array  " + Arrays.toString(array));
		for (int i = 0; i < array.length; i++) {
			int min = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[min]) {
					min = j;
				}
			}

			int tmp = array[i];
			array[i] = array[min];
			array[min] = tmp;

		}

		System.out.println("Elements of array after Selection sort  " + Arrays.toString(array));
		sc.close();
	}

}
