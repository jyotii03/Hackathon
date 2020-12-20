import java.util.Scanner;

public class Q22IntToString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your int to convert in String ");

		int i=sc.nextInt();
		String s=String.valueOf(i);
		System.out.println("Converted value in String "+s);
		sc.close();
	}

}
