package src.main.java;
public class J3SmallStringMethods {

	public static void main(String[] args) {
		J3SmallStringMethods ssm = new J3SmallStringMethods();
//		ssm.indexoftest();
//		ssm.splitwithlimit();
//		ssm.intern();
//		ssm.replaceall();
		ssm.getCharsMethod();
	}

	public void indexoftest(){
		String s1="this is index of is example";  
		//passing substring  
		int index1=s1.indexOf("is");//returns the index of is substring  
		int index2=s1.indexOf("index");//returns the index of index substring  
		System.out.println(index1+"  "+index2);//2 8  

		//passing substring with from index 
		int index3=s1.indexOf("is"); //returns 5
		System.out.println(index3);//5 i.e. the index of another is
		int index4=s1.indexOf("is",index3 +1);//returns the next index of 'is' substring after 1st index  
		System.out.println("second occurence index "+index4);//5 i.e. the index of another is  

		//passing char value  
		int index5=s1.indexOf('s');//returns the index of s char value  
		System.out.println(index5);//3  
	}

	public void splitwithlimit(){
		//limit : limit for the number of strings in array. 
		// If it is zero, it will returns all the strings matching regex.

		String s1="java string split method by javatpoint";  
		String[] words=s1.split("\\s");//splits the string based on whitespace  
		//using java foreach loop to print elements of string array  
		for(String w:words) { 
			System.out.println(w);  
		}
		System.out.println("=========== With Limit ==============");
		String[] words1=s1.split("\\s",2);//splits the string based on whitespace  
		for(String w1:words1){  
			System.out.println(w1);  
		}
	} 

	public void intern(){
		String s1 = "Javatpoint";  
		String s2 = s1.intern();  
		String s3 = new String("Javatpoint");  
		String s4 = s3.intern();          
		System.out.println(s1==s2); // True  
		System.out.println(s1==s3); // False  
		System.out.println(s1==s4); // True       
		System.out.println(s2==s3); // False  
		System.out.println(s2==s4); // True        
		System.out.println(s3==s4); // False   
	}
	
	public void replaceall(){
		String s1="My name is Khan. My name is Bob. My name is Sonoo.";  
		String replaceString=s1.replaceAll("is","was");//replaces all occurrences of "is" to "was"  
		System.out.println(s1);  
		System.out.println(replaceString);  
	}
	
	public void getCharsMethod(){
		 String str = new String("hello javatpoint how r u");  
	      char[] ch = new char[10];  
	      try{  
	         str.getChars(6, 16, ch, 0);  
	         System.out.println(ch);  
	      }catch(Exception ex){System.out.println(ex);}  
	}
}
