package src.main.java;

import java.util.ArrayList;
import java.util.Collections;

public class J6Comparable {

	public static void main(String args[]){  
		ArrayList<J6StudentComparable> al=new ArrayList<J6StudentComparable>();  
		al.add(new J6StudentComparable(101,"Vijay",23));  
		al.add(new J6StudentComparable(106,"Ajay",27));  
		al.add(new J6StudentComparable(105,"Jai",21)); 

		Collections.sort(al);  

		for(J6StudentComparable st:al){  
			System.out.println(st.rollno+" "+st.name+" "+st.age);  
		}  
	}
}
