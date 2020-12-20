import java.util.Scanner;

public class Q2Factorial {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter your  digit to find factorial: ");
		
		int input = sc.nextInt();
		sc.close();
		
		int result = 1;
		for (int i = 1; i <= input; i++) {
			
			result = result*i;
			
		}
		System.out.println("Factorial of " +input + " is: "+result);
		
	}

}
