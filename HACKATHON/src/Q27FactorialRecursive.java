import java.util.Scanner;

public class Q27FactorialRecursive {

	public static void main(String[] args) {

		int n, fact;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number for factorial : ");
		n = sc.nextInt();

		fact = calculateFactorial(n);
		System.out.println("The factorial of number " + n + " is " + fact);

		sc.close();

	}

	public static int calculateFactorial(int n) {

		if (n <= 1) {
			return 1;
		} else {
			return n * (calculateFactorial(n - 1));
		}

	}

}
