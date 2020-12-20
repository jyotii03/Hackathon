import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q18DuplicateCharacter {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter your string ");
		String str=sc.nextLine();
		
		char[] arr=str.toCharArray();
		
		Map<Character,Integer> countMap=new HashMap<Character,Integer>();
		for(Character i:arr) {
			if((int)i==32) {
				
			}else
			if(!countMap.containsKey(i)) {
				countMap.put(i, 1);
			}
			else {
				Integer count=countMap.get(i);
				count++;
				countMap.put(i, count);
			}
			
		}
		
		System.out.println("Repeated chars in String = ");
		for (Map.Entry<Character,Integer> entry : countMap.entrySet())  
            					
			if(entry.getValue()!=1) {
				System.out.println(entry.getKey()+"-> ocuured " + 
	                             + entry.getValue()+" Times"); 
			}

			
			sc.close();
}

	
	}


