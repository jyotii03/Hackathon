import java.util.Scanner;

public class Q14ReverseWord {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String str,str2="";
		
		System.out.println(" Enter string ");
		str=scanner.nextLine();
	
	
	String[] reverse=str.split(" ");
	for(int i=reverse.length-1;i>=0;i--) {
		
		str2=str2+reverse[i]+" ";
	
		
	}
	System.out.println(" Reverse String is "+ str2);
	
	scanner.close();

	}	
}
	


