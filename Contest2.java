//This program identifies the spam word present in all files of the given folder and replaces the letters in the word with "*"
import java.util.*;
import java.io.*;
public class Contest2 {
	List<String> str = new ArrayList<>();
	str.add("Bad");
	str.add("Boring");
	str.add("Sleepy");

	void isSpam(String st){
	 if(str.contains(st)){
  		for(int i = 0; i < st.size(); i++){
   			st[i] = '*';
 		}
 	 }
 	 return st;
	}


	public static void removeSpam(String folder) {

		// Your logic goes here

		try  
		{   
    	  File directory=new File(folder);
    	  int fileCount=directory.list().length;
   		  while(fileCount--){
      			String st;
      			String fname = folder + directory[i];
      			File file=new File(fname);
      			FileInputStream fis=new FileInputStream(file); 
      			int r=0, i = 0;
    		while((r=fis.read())!=-1){  
     			char ch = (char)r;
     			if(ch != ' '){
     			    st.insert(i, ch);
      			    i++;
     			}
      			else{
       				String stri = isSpam(st);
       				int temp = r - stri.size();
       				file.writeString(fis, stri);
     			}
  			  }
  		  }  
		}  
		catch(Exception e)  
		{  
  			System.out.println("Caught Exception" + e);  
		}  
    
	}

	public static void main(String[] args) throws Exception {
		String folder = "C:/notes";

		removeSpam(folder);
	}

}
Constraints of this program would be that only the words in the list will be considered as spam