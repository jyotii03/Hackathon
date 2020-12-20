import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Q15UniqueWords {

	public static void main(String[] args) {
		
		        Scanner sc = new Scanner(System.in);
		        System.out.println("Enter your words:");
		        
		        String str = sc.nextLine();
		        String[] words = str.split(" ");
		        
		        HashSet<String> uniqueWords = new HashSet<String>(Arrays.asList(words));
		        
		        for(String s:uniqueWords)
		            System.out.println(s);
		       sc.close(); 
		    }

		


	}


