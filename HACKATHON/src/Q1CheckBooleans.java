import java.util.Scanner;

public class Q1CheckBooleans {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your word:");
		String a = sc.nextLine();
		String b = sc.nextLine();
		String c = sc.nextLine();
		sc.close();

		if ((a.equals(b)) && (b.equals(c))) {
			System.out.println("All are true");
		} else if ((a.equals(b)) || (b.equals(c))) {
			System.out.println("Two booloeans variable are True ");
		
		}else {
			System.out.println("All are different");
		}
	}

}
