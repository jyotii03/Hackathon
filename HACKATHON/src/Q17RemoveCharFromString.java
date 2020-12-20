import java.util.Scanner;

public class Q17RemoveCharFromString {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter your string ");
        String str=sc.nextLine();
        System.out.println("enter char to remove ");
        char c=sc.nextLine().charAt(0);
        String newStr=str.replace(c, ' ');
        System.out.println(newStr);
        sc.close();

	}

}
