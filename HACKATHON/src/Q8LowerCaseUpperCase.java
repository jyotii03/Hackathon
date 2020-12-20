import java.util.Scanner;

public class Q8LowerCaseUpperCase {

	public static void main(String[] args) {

		

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Your Sentence:");
			String sent = sc.nextLine();
			sc.close();
			
			System.out.println(sent.toUpperCase());

		}

	}


