import java.util.Scanner;

public class Q3SortArrayInteger {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("How many numbers you want to sort = ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.println("Enter number " + (i + 1) + " = ");
			arr[i] = sc.nextInt();
			sc.close();
		}
		System.out.println("Original array is -");
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + "   ");
		}
		int temp = arr[0];
		for (int i = 0; i < size; i++) {
			for (int j = 1; j < size - i; j++) {
				if (arr[j - 1] > arr[j]) {
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}

			}
		}
		System.out.println("\nSorted Array is -");
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + "   ");
		}

	}

}
