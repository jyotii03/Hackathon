import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;



public class Q31ReadnWrite {

		public static class ReadWriteFileReverse {

			public static void main(String[] args) throws Exception {
			
				String file1="/Users/jyoti/eclipse-workspace/HACKATHON/src/Jyoti.txt";
				FileReader fr=new FileReader(file1);
				BufferedReader b=new BufferedReader(fr);
				
			
			
				String file="/Users/jyoti/eclipse-workspace/HACKATHON/src/JyotiWrite.txt";
				FileWriter fw=new FileWriter(file);
				BufferedWriter bw=new BufferedWriter(fw);
			
			        String s=" ";               
			        List<String> tmp = new ArrayList<String>();
			        do{
			        s = b.readLine();
			        System.out.println(s);
			        tmp.add(s);
			        }while(s!=null);
			    String str="";
			 
			        for(int i=tmp.size()-1;i>=0;i--) {
			        	if(tmp.get(i)==null) {
			        		
			        	}else {
			        	 str=tmp.get(i);
			        System.out.println(tmp.get(i));
			        bw.write(str+"\n");
			        
			       
			        }}
			        bw.close();
			    }
								
				

			

		}

	}


