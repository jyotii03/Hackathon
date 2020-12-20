import java.util.Scanner;

public class Q21Stringtoint {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your string to convert in int ");

		String s=sc.nextLine();
		int i=Integer.valueOf(s);
		System.out.println("Converted value in Integer "+i);
		
	 sc.close();

	}

}
