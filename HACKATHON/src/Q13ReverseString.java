import java.util.Scanner;

public class Q13ReverseString {

	public static void main(String[] args) {
		
			Scanner scanner=new Scanner(System.in);
			System.out.println(" Enter the String ");
			String str,str2="";
		
			str=scanner.nextLine();

			for(int i=str.length()-1;i>=0;i--) {
				
				str2=str2+str.charAt(i);
				
			}
			System.out.println(" Reverse String is --> "+ str2);
			scanner.close();
			
		}
	
	}
