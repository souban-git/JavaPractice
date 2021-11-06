package src.main.java;
import java.util.*;  
import java.io.*; 

public class J9PropertiesFile {

	public static void main(String[] args)throws Exception{  


		/*1. Reading of Properties file*/
		FileReader reader=new FileReader("C://Users//Moham//Google Drive//SoubanGitRepo//JavaPractice//src//main//java//src//main//java//db.properties");  
		Properties p=new Properties();  
		p.load(reader);  
		System.out.println(p.getProperty("user"));  
		System.out.println(p.getProperty("password"));

		/*2. Printing all system path values*/
		Properties p1=System.getProperties();  
		Set set=p1.entrySet();  
		Iterator itr=set.iterator();  
		while(itr.hasNext()){  
			Map.Entry entry=(Map.Entry)itr.next();  
			System.out.println(entry.getKey()+" = "+entry.getValue());  
		}
		
		/*3. Writing all to file*/
		p1.setProperty("name","Sonoo Jaiswal");  
		p1.setProperty("email","sonoojaiswal@javatpoint.com");  
		p1.store(new FileWriter("info.properties"),"Javatpoint Properties Example"); 
		
	}  
}
