import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q19OccuranceOfChar {

	public static void main(String[] args) {
		
		Scanner scanner =new Scanner(System.in);
		
		System.out.println("Enter your String ");
		String str=scanner.nextLine();
		
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
		
		for (Map.Entry<Character,Integer> entry : countMap.entrySet())  
            System.out.println(entry.getKey()+"-> ocuured " + 
                              + entry.getValue()+" Times"); 
    
			scanner.close();
}

	





	}


